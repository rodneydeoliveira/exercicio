import Foundation

struct Tag: Codable, Identifiable {
    let id: String
    let name: String
    let category: String
    let color: String
}