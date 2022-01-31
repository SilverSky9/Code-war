//
//  convertBoolearn.swift
//  
//
//  Created by Nopphadon Phanwong on 30/1/22.
//
import XCTest

class SolutionTest: XCTestCase {
    static var allTests = [
        ("Fixed Tests", testFixed)
    ]

    func testFixed() {
        XCTAssertEqual(boolToWord(true), "Yes", "Input: true")
        XCTAssertEqual(boolToWord(false), "No", "Input: false")
    }
}

XCTMain([
    testCase(SolutionTest.allTests)
])
