/**
 * Course: DGL 204 - Programming for mobile app development
 * Semester: Fall 2023
 * Author: Ashley Blacquiere

 * Week 03 lecture code
 * Reference: https://kotlinlang.org/docs/null-safety.html
 */

// **Kotlin Classes**

fun main() {

    // Nullable types are declared by appending a "?" to the end of the type. Any type can be nullable.
    val number: Int?
    val character: Char?
    val text: String?

    // Nullable types can be initialized later, just as normal
    number = 10
    character = 'w'
    // With the exception that null can be assigned to the variable
    text = null


    // Can we assign null to a non-nullable?
//    val message: String = null

    // What if we use type inference to declare a nullable?
    val nullWithTypeInference = null // Nothing? type!

    // We can perform any operation that makes sense with a nullable
    println(number)
    println(character)
    println(text)

    // However, if we know we're dealing with nullable values we must handle them appropriately, or risk a runtime crash

    // We can use a straight null check:
//    if (number != null) {
//        val result = number + 100
//        println("Sum of $number + 100: $result")
//    } else {
//        println("Number was null")
//    }
//
//    // Or, wherever possible, we should use safe calls:
//    var result = number?.plus(100)
//    println("Sum of $number + 100: $result")
//
//    // Or, we can use a scoped let call
//    result = number?.let {number + 50}
//    println("Sum of $number + 50: $result")
//
//    // And, whenever possible, we should include an alternative if our value is ever null
//    var message = text?.let { "The val text contains: $text" } ?: "Text was null!"
//    println(message)

}
