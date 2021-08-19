package com.example.anroid_toy_project.kotlin

// 08. 제어흐름 2
// When

fun main(args: Array<String>) {
    val value: Int = 2
    when (value) {
        1 -> {
            println("Value is 1")
        }
        2 -> {
            println("Value is 2")
        }
        else -> {
            println("I don't know")
        }
    }

    val num: Int = 100
    when (num) {
        1 -> 100
        2 -> 100
        100 -> println("Correct")
        else -> println("Wrong Value")
    }

    val value2: Boolean? = null
    when (value2) {
        true -> println("True")
        false -> println("False")
        null -> println("Null")
    }

    val value3: Int = 10
    when (value3) {
        is Int -> println("value3 is 10")
        else -> println("value3 is not 10")
    }

    val value4: Int = 87
    when(value4) {
        in 60..70 -> println("value is in 60-70")
        in 70..80 -> println("value is in 70-80")
        in 80..90 -> println("value is in 80-90")
        else -> println("value is wrong")
    }
}