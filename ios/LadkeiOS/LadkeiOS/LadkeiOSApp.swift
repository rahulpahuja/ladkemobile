//
//  LadkeiOSApp.swift
//  LadkeiOS
//
//  Created by Apple on 23/08/23.
//

import SwiftUI

@main
struct LadkeiOSApp: App {
    let persistenceController = PersistenceController.shared

    var body: some Scene {
        WindowGroup {
            ContentView()
                .environment(\.managedObjectContext, persistenceController.container.viewContext)
        }
    }
}
