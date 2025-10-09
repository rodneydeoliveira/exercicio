import Foundation

struct Rankings: Codable {
    let topWines: [TopWine]
    let topRestaurants: [TopRestaurant]
    let topReviewers: [TopReviewer]
}

struct TopWine: Codable, Identifiable {
    let wineId: String
    let brand: String
    let grapeType: String
    let averageRating: Double
    let totalReviews: Int
    let position: Int
    
    var id: String { wineId }
}

struct TopRestaurant: Codable, Identifiable {
    let restaurantId: String
    let name: String
    let averageRating: Double
    let totalReviews: Int
    let position: Int
    
    var id: String { restaurantId }
}

struct TopReviewer: Codable, Identifiable {
    let userId: String
    let name: String
    let totalPoints: Int
    let totalReviews: Int
    let position: Int
    
    var id: String { userId }
}