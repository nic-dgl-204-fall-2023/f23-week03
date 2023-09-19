/*******************************************************
Course: DGL 204 - Programming for mobile app development
Semester: Fall 2023
Author: Ashley Blacquiere

Week 03 lecture code
Reference: https://kotlinlang.org/docs/destructuring-declarations.html
 *******************************************************/

fun main() {
    // Destructing declarations allow you to initialize multiple varables at one time, destructured from a data structure like an array
    val charArray = charArrayOf('x', 'y', 'z')
    val (a, b, _) = charArray
    println("The first element destructured from the char array: $a")
    println(b)


    // STRINGS
    // String declarations use double quotes
    var message = "I love Kotlin!"

    // Note that Character declarations use single quotes
    var character = 'w'

    // Strings can actually be treated as arrays of Chars!
    println("\n\nStrings")
    println("message $message")
    println("Fourth char of the message array: ${message[3]}")

    // STRING METHODS
    // The split method returns an array of string elements split on the given delimiter
    var parts = message.split(" ")
    println("\n\nString methods")
    parts.forEach { print("$it, ") }
    println("Array size: ${parts.size}")
    println("The second part of the message string: ${parts[1]}")

    var subst = message.substring(4..8)
    println("The substring is: $subst")

    // String templates, or interpoloated strings, are written in double quotes - we've used them above!
    // Use curly braces to surround multipart expressions
    println("\n\nString templates")
    val oneHundred = 100
    val interpolatedString1 = "This is a string with fewer than $oneHundred characters."
    val interpolatedString2 = "This is a string with fewer than ${oneHundred * 10} characters."

    println(interpolatedString1)
    println(interpolatedString2)

    // MULTILINE STRINGS
    //Multiline strings can be declared using triple double-quotes. Don't modify the formatting!
    println("\n\nMultline string")
    val longString = """This is the first line
                       |This is the second line
        |   This is the third line
    """.trimMargin()
    println(longString)



}