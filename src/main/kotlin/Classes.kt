/**
 * Course: DGL 204 - Programming for mobile app development
 * Semester: Fall 2023
 * Author: Ashley Blacquiere

 * Week 03 lecture code
 * Reference: https://kotlinlang.org/docs/classes.html
 */

// **Kotlin Classes**

// Kotlin classes are declared with the `class` keyword
class ATestClass {
    // Member/instance variables (or fields) can be declared at the class level
    val name: String //vals are immutable - they cannot change!
    var count: Int // vars are mutable - they can be reassigned
    var message: String

    // Constructors can be declared using the `constructor` keyword and can include any number or type of parameters
    // Note that the parameter names used can be the same as the names as the member/instance variables, but `this' should be used to disambiguate between names
    constructor(setName: String, count: Int, message: String) {
        name = setName
        this.count = count
    }

    // An `init` block can be used to initialize uninitialized variables/fields before any class code is executed
    init {
        message = "I'm a Kotlin class!"
    }
}

// We can make our code more concise by using Kotlin's class signature constructor syntax
// Note that the same rule as above applies for the use of parameter names identical to member/instance variable names
class ASlimmerTestClass constructor(setName: String, setCount: Int) {
    var name = setName
    var count = setCount
}

// And we don't actually need to use the `constructor` keyword at all!
class ASecondSlimmerTestClass(name: String, count: Int) {
    var name = name
    var count = count
}

// Finally, for the most slimmed down version, we can actually declare our member/instance variables in the place of parameters in the constructor!
class TheSlimmestClass(var name: String, var count: Int)

fun main() {
    val class1 = ATestClass("Test", 0, message = "Hello, world!")
    val class2 = ASlimmerTestClass("Slim", 0)
    val class3 = ASecondSlimmerTestClass("Slimmer", 0)
    val class4 = TheSlimmestClass("Slimmest", 0)

}