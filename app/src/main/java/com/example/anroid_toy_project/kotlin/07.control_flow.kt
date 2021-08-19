package com.example.anroid_toy_project.kotlin

// 08. 제어 흐름
// if, else

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    if (a > b) {
        println("A > B")
    }
    else if (a == b) {
        println("A = B")
    }
    else {
        println("A < B")
    }
    println("Finished")

    // 값을 리턴하는 if 사용
    val max = if (a > b) a else b
    println(max)

    // 엘비스 연산자 ?:
    val number: Int? = null
    val number2 = number ?: 10
    println(number2)
}