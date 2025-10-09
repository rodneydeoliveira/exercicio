import SwiftUI

struct HomeView: View {
    @StateObject private var dataService = DataService()
    @State private var selectedTab = 0
    
    var body: some View {
        NavigationView {
            VStack(spacing: 0) {
                // Header
                headerView
                
                // Tab Selector
                tabSelector
                
                // Content
                TabView(selection: $selectedTab) {
                    // Top Wines Tab
                    topWinesView
                        .tag(0)
                    
                    // Top Restaurants Tab
                    topRestaurantsView
                        .tag(1)
                    
                    // Top Reviewers Tab
                    topReviewersView
                        .tag(2)
                    
                    // Recent Reviews Tab
                    recentReviewsView
                        .tag(3)
                }
                .tabViewStyle(PageTabViewStyle(indexDisplayMode: .never))
            }
            .navigationBarHidden(true)
        }
        .onAppear {
            dataService.loadMockData()
        }
    }
    
    // MARK: - Header View
    private var headerView: some View {
        VStack(spacing: 16) {
            HStack {
                VStack(alignment: .leading, spacing: 4) {
                    Text("Vino & Venue")
                        .font(.largeTitle)
                        .fontWeight(.bold)
                        .foregroundColor(.primary)
                    
                    Text("Descubra vinhos e lugares incríveis")
                        .font(.subheadline)
                        .foregroundColor(.secondary)
                }
                
                Spacer()
                
                // Profile Button
                Button(action: {}) {
                    Image(systemName: "person.circle.fill")
                        .font(.title2)
                        .foregroundColor(.primary)
                }
            }
            .padding(.horizontal, 20)
            .padding(.top, 10)
        }
        .background(Color(.systemBackground))
    }
    
    // MARK: - Tab Selector
    private var tabSelector: some View {
        ScrollView(.horizontal, showsIndicators: false) {
            HStack(spacing: 20) {
                ForEach(tabs, id: \.self) { tab in
                    Button(action: {
                        withAnimation(.easeInOut(duration: 0.3)) {
                            selectedTab = tabs.firstIndex(of: tab) ?? 0
                        }
                    }) {
                        VStack(spacing: 8) {
                            Text(tab)
                                .font(.subheadline)
                                .fontWeight(selectedTab == tabs.firstIndex(of: tab) ? .semibold : .regular)
                                .foregroundColor(selectedTab == tabs.firstIndex(of: tab) ? .primary : .secondary)
                            
                            Rectangle()
                                .fill(selectedTab == tabs.firstIndex(of: tab) ? Color.primary : Color.clear)
                                .frame(height: 2)
                        }
                    }
                }
            }
            .padding(.horizontal, 20)
        }
        .padding(.vertical, 16)
        .background(Color(.systemBackground))
    }
    
    private let tabs = ["Vinhos", "Restaurantes", "Avaliadores", "Recentes"]
    
    // MARK: - Top Wines View
    private var topWinesView: some View {
        ScrollView {
            LazyVStack(spacing: 16) {
                if dataService.isLoading {
                    ProgressView("Carregando...")
                        .frame(maxWidth: .infinity, maxHeight: .infinity)
                } else if let error = dataService.error {
                    Text("Erro: \(error)")
                        .foregroundColor(.red)
                        .padding()
                } else {
                    ForEach(dataService.getTopWines()) { wine in
                        WineCardView(wine: wine, dataService: dataService)
                    }
                }
            }
            .padding(.horizontal, 20)
            .padding(.top, 20)
        }
    }
    
    // MARK: - Top Restaurants View
    private var topRestaurantsView: some View {
        ScrollView {
            LazyVStack(spacing: 16) {
                if dataService.isLoading {
                    ProgressView("Carregando...")
                        .frame(maxWidth: .infinity, maxHeight: .infinity)
                } else if let error = dataService.error {
                    Text("Erro: \(error)")
                        .foregroundColor(.red)
                        .padding()
                } else {
                    ForEach(dataService.getTopRestaurants()) { restaurant in
                        RestaurantCardView(restaurant: restaurant, dataService: dataService)
                    }
                }
            }
            .padding(.horizontal, 20)
            .padding(.top, 20)
        }
    }
    
    // MARK: - Top Reviewers View
    private var topReviewersView: some View {
        ScrollView {
            LazyVStack(spacing: 16) {
                if dataService.isLoading {
                    ProgressView("Carregando...")
                        .frame(maxWidth: .infinity, maxHeight: .infinity)
                } else if let error = dataService.error {
                    Text("Erro: \(error)")
                        .foregroundColor(.red)
                        .padding()
                } else {
                    ForEach(dataService.getTopReviewers()) { reviewer in
                        ReviewerCardView(reviewer: reviewer, dataService: dataService)
                    }
                }
            }
            .padding(.horizontal, 20)
            .padding(.top, 20)
        }
    }
    
    // MARK: - Recent Reviews View
    private var recentReviewsView: some View {
        ScrollView {
            LazyVStack(spacing: 16) {
                if dataService.isLoading {
                    ProgressView("Carregando...")
                        .frame(maxWidth: .infinity, maxHeight: .infinity)
                } else if let error = dataService.error {
                    Text("Erro: \(error)")
                        .foregroundColor(.red)
                        .padding()
                } else {
                    ForEach(dataService.getRecentReviews()) { review in
                        ReviewCardView(review: review, dataService: dataService)
                    }
                }
            }
            .padding(.horizontal, 20)
            .padding(.top, 20)
        }
    }
}

// MARK: - Card Views

struct WineCardView: View {
    let wine: TopWine
    let dataService: DataService
    
    var body: some View {
        VStack(alignment: .leading, spacing: 12) {
            HStack {
                VStack(alignment: .leading, spacing: 4) {
                    Text(wine.brand)
                        .font(.headline)
                        .fontWeight(.semibold)
                    
                    Text(wine.grapeType)
                        .font(.subheadline)
                        .foregroundColor(.secondary)
                    
                    if let vintage = dataService.getWineById(wine.wineId)?.vintage {
                        Text("Safra \(vintage)")
                            .font(.caption)
                            .foregroundColor(.secondary)
                    }
                }
                
                Spacer()
                
                VStack(alignment: .trailing, spacing: 4) {
                    HStack(spacing: 4) {
                        Image(systemName: "star.fill")
                            .foregroundColor(.yellow)
                            .font(.caption)
                        
                        Text(String(format: "%.1f", wine.averageRating))
                            .font(.subheadline)
                            .fontWeight(.semibold)
                    }
                    
                    Text("\(wine.totalReviews) avaliações")
                        .font(.caption)
                        .foregroundColor(.secondary)
                }
            }
            
            // Tags
            if let wineData = dataService.getWineById(wine.wineId) {
                ScrollView(.horizontal, showsIndicators: false) {
                    HStack(spacing: 8) {
                        ForEach(wineData.tags, id: \.self) { tag in
                            Text(tag)
                                .font(.caption)
                                .padding(.horizontal, 8)
                                .padding(.vertical, 4)
                                .background(Color.blue.opacity(0.1))
                                .foregroundColor(.blue)
                                .cornerRadius(8)
                        }
                    }
                    .padding(.horizontal, 1)
                }
            }
        }
        .padding(16)
        .background(Color(.systemBackground))
        .cornerRadius(12)
        .shadow(color: .black.opacity(0.1), radius: 4, x: 0, y: 2)
    }
}

struct RestaurantCardView: View {
    let restaurant: TopRestaurant
    let dataService: DataService
    
    var body: some View {
        VStack(alignment: .leading, spacing: 12) {
            HStack {
                VStack(alignment: .leading, spacing: 4) {
                    Text(restaurant.name)
                        .font(.headline)
                        .fontWeight(.semibold)
                    
                    if let restaurantData = dataService.getRestaurantById(restaurant.restaurantId) {
                        Text(restaurantData.address)
                            .font(.subheadline)
                            .foregroundColor(.secondary)
                            .lineLimit(2)
                    }
                }
                
                Spacer()
                
                VStack(alignment: .trailing, spacing: 4) {
                    HStack(spacing: 4) {
                        Image(systemName: "star.fill")
                            .foregroundColor(.yellow)
                            .font(.caption)
                        
                        Text(String(format: "%.1f", restaurant.averageRating))
                            .font(.subheadline)
                            .fontWeight(.semibold)
                    }
                    
                    Text("\(restaurant.totalReviews) avaliações")
                        .font(.caption)
                        .foregroundColor(.secondary)
                }
            }
            
            // Tags
            if let restaurantData = dataService.getRestaurantById(restaurant.restaurantId) {
                ScrollView(.horizontal, showsIndicators: false) {
                    HStack(spacing: 8) {
                        ForEach(restaurantData.tags, id: \.self) { tag in
                            Text(tag)
                                .font(.caption)
                                .padding(.horizontal, 8)
                                .padding(.vertical, 4)
                                .background(Color.green.opacity(0.1))
                                .foregroundColor(.green)
                                .cornerRadius(8)
                        }
                    }
                    .padding(.horizontal, 1)
                }
            }
        }
        .padding(16)
        .background(Color(.systemBackground))
        .cornerRadius(12)
        .shadow(color: .black.opacity(0.1), radius: 4, x: 0, y: 2)
    }
}

struct ReviewerCardView: View {
    let reviewer: TopReviewer
    let dataService: DataService
    
    var body: some View {
        HStack(spacing: 16) {
            // Profile Image Placeholder
            Circle()
                .fill(Color.blue.opacity(0.2))
                .frame(width: 50, height: 50)
                .overlay(
                    Text(String(reviewer.name.prefix(1)))
                        .font(.title2)
                        .fontWeight(.semibold)
                        .foregroundColor(.blue)
                )
            
            VStack(alignment: .leading, spacing: 4) {
                Text(reviewer.name)
                    .font(.headline)
                    .fontWeight(.semibold)
                
                Text("\(reviewer.totalPoints) pontos • \(reviewer.totalReviews) avaliações")
                    .font(.subheadline)
                    .foregroundColor(.secondary)
            }
            
            Spacer()
            
            VStack(alignment: .trailing, spacing: 4) {
                Text("#\(reviewer.position)")
                    .font(.title2)
                    .fontWeight(.bold)
                    .foregroundColor(.primary)
                
                Text("Posição")
                    .font(.caption)
                    .foregroundColor(.secondary)
            }
        }
        .padding(16)
        .background(Color(.systemBackground))
        .cornerRadius(12)
        .shadow(color: .black.opacity(0.1), radius: 4, x: 0, y: 2)
    }
}

struct ReviewCardView: View {
    let review: Review
    let dataService: DataService
    
    var body: some View {
        VStack(alignment: .leading, spacing: 12) {
            HStack {
                VStack(alignment: .leading, spacing: 4) {
                    if let wine = dataService.getWineById(review.wineId) {
                        Text(wine.brand)
                            .font(.headline)
                            .fontWeight(.semibold)
                    }
                    
                    if let restaurant = dataService.getRestaurantById(review.restaurantId) {
                        Text("em \(restaurant.name)")
                            .font(.subheadline)
                            .foregroundColor(.secondary)
                    }
                }
                
                Spacer()
                
                VStack(alignment: .trailing, spacing: 4) {
                    HStack(spacing: 8) {
                        HStack(spacing: 2) {
                            Image(systemName: "wineglass.fill")
                                .foregroundColor(.purple)
                                .font(.caption)
                            Text(String(format: "%.1f", review.wineRating))
                                .font(.caption)
                                .fontWeight(.semibold)
                        }
                        
                        HStack(spacing: 2) {
                            Image(systemName: "fork.knife")
                                .foregroundColor(.orange)
                                .font(.caption)
                            Text(String(format: "%.1f", review.restaurantRating))
                                .font(.caption)
                                .fontWeight(.semibold)
                        }
                    }
                }
            }
            
            if let wineComment = review.wineComment, !wineComment.isEmpty {
                Text(wineComment)
                    .font(.subheadline)
                    .foregroundColor(.primary)
                    .lineLimit(2)
            }
            
            HStack {
                Text("+\(review.pointsEarned) pontos")
                    .font(.caption)
                    .fontWeight(.semibold)
                    .foregroundColor(.green)
                
                Spacer()
                
                Text(formatDate(review.createdAt))
                    .font(.caption)
                    .foregroundColor(.secondary)
            }
        }
        .padding(16)
        .background(Color(.systemBackground))
        .cornerRadius(12)
        .shadow(color: .black.opacity(0.1), radius: 4, x: 0, y: 2)
    }
    
    private func formatDate(_ dateString: String) -> String {
        let formatter = DateFormatter()
        formatter.dateFormat = "yyyy-MM-dd'T'HH:mm:ss'Z'"
        formatter.timeZone = TimeZone(abbreviation: "UTC")
        
        if let date = formatter.date(from: dateString) {
            let displayFormatter = DateFormatter()
            displayFormatter.dateFormat = "dd/MM/yyyy"
            return displayFormatter.string(from: date)
        }
        
        return dateString
    }
}

#Preview {
    HomeView()
}