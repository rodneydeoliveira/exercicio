import Foundation

struct User: Codable, Identifiable {
    let id: String
    let name: String
    let email: String
    let profilePhoto: String?
    let createdAt: String
    let totalPoints: Int
    let level: String
}

struct UserPoints: Codable {
    let userId: String
    let totalPoints: Int
    let level: String
    let pointsBreakdown: PointsBreakdown
    
    struct PointsBreakdown: Codable {
        let photoWineLabel: Int
        let photoRestaurant: Int
        let reviewWithoutPhoto: Int
    }
}