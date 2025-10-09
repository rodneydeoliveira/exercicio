import Foundation

struct AppData: Codable {
    let users: [User]
    let restaurants: [Restaurant]
    let wines: [Wine]
    let reviews: [Review]
    let tags: [Tag]
    let rankings: Rankings
    let userPoints: [UserPoints]
}