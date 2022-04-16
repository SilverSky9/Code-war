//
//  TestView.swift
//  toktoktik
//
//  Created by Nopphadon Phanwong on 11/4/22.
//

import SwiftUI

struct TestView: View {
    var body: some View {
        NavigationView{
            List{
                NavigationLink("Link",destination: PlayerView())
            }
        }
    }
}

struct TestView_Previews: PreviewProvider {
    static var previews: some View {
        TestView()
    }
}
