//
//  PlayerView.swift
//  toktoktik
//
//  Created by Nopphadon Phanwong on 11/4/22.
//

import SwiftUI

struct PlayerView: View {
    var body: some View {
        NavigationView{
            List{
                Text("Start game")
                Text("Score")
                Text("Credit")
            }
            .navigationTitle("Menu")
        }
    }
    
}

struct PlayerView_Previews: PreviewProvider {
    static var previews: some View {
        PlayerView()
    }
}
