import Foundation

struct Review: Codable, Identifiable {
    let id: String
    let userId: String
    let restaurantId: String
    let wineId: String
    let wineRating: Double
    let restaurantRating: Double
    let wineComment: String?
    let restaurantComment: String?
    let wineTags: [String]
    let restaurantTags: [String]
    let photos: Photos
    let pointsEarned: Int
    let createdAt: String
    let updatedAt: String
    
    struct Photos: Codable {
        let wineLabel: String?
        let restaurant: String?
    }
}