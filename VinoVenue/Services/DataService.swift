import Foundation

class DataService: ObservableObject {
    @Published var appData: AppData?
    @Published var isLoading = false
    @Published var error: String?
    
    init() {
        loadMockData()
    }
    
    func loadMockData() {
        isLoading = true
        error = nil
        
        guard let url = Bundle.main.url(forResource: "wine-place-data-structure", withExtension: "json") else {
            error = "Arquivo JSON não encontrado"
            isLoading = false
            return
        }
        
        do {
            let data = try Data(contentsOf: url)
            let decoder = JSONDecoder()
            appData = try decoder.decode(AppData.self, from: data)
            isLoading = false
        } catch {
            self.error = "Erro ao carregar dados: \(error.localizedDescription)"
            isLoading = false
        }
    }
    
    // MARK: - Helper Methods
    
    func getTopWines(limit: Int = 5) -> [TopWine] {
        return Array(appData?.rankings.topWines.prefix(limit) ?? [])
    }
    
    func getTopRestaurants(limit: Int = 5) -> [TopRestaurant] {
        return Array(appData?.rankings.topRestaurants.prefix(limit) ?? [])
    }
    
    func getTopReviewers(limit: Int = 5) -> [TopReviewer] {
        return Array(appData?.rankings.topReviewers.prefix(limit) ?? [])
    }
    
    func getRecentReviews(limit: Int = 5) -> [Review] {
        let sortedReviews = appData?.reviews.sorted { $0.createdAt > $1.createdAt } ?? []
        return Array(sortedReviews.prefix(limit))
    }
    
    func getWineById(_ id: String) -> Wine? {
        return appData?.wines.first { $0.id == id }
    }
    
    func getRestaurantById(_ id: String) -> Restaurant? {
        return appData?.restaurants.first { $0.id == id }
    }
    
    func getUserById(_ id: String) -> User? {
        return appData?.users.first { $0.id == id }
    }
}