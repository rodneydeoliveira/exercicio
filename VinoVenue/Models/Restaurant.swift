import Foundation

struct Restaurant: Codable, Identifiable {
    let id: String
    let name: String
    let address: String
    let coordinates: Coordinates
    let averageRating: Double
    let totalReviews: Int
    let tags: [String]
    let createdAt: String
    
    struct Coordinates: Codable {
        let lat: Double
        let lng: Double
    }
}