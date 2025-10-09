import Foundation

struct Wine: Codable, Identifiable {
    let id: String
    let brand: String
    let grapeType: String
    let vintage: Int?
    let averageRating: Double
    let totalReviews: Int
    let tags: [String]
    let createdAt: String
}