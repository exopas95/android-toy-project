package com.example.anroid_toy_project.kotlin

fun plusThree(first: Int, second: Int, third: Int): Int {
    return first + second + third
}

fun subtractThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1): Int{
    return first * second * third
}

fun main(array: Array<String>) {

    val result = plusThree(first = 1, second = 2, third = 3)
    val result2 = plusThree(first = 10, second = 1, third = 2)
    val result3 = multiplyThree(first = 2, second = 2, third = 2)
    val result4 = multiplyThree()

    println(result)
    println(result2)
    println(result3)
    println(result4)
}
