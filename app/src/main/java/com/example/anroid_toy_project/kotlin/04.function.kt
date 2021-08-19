package com.example.anroid_toy_project.kotlin

// 04. 함수
// fun 함수명 (변수명: 타입, 변수명: 타입, ...) : 반환형 {
//      함수 내용
//      return 반환값
// }

// Basic function
fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// Function with default values
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// Function with no return
// 이 경우 반환값은 생략이 가능하다.
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

// Simple way to make function
fun plusShort(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수 선언 방법
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main(array: Array<String>) {
    val result = plus(5, 10)
    println(result)

    val result2 = plus(first = 20, second = 30)
    println(result2)

    val result3 = plusFive(10, 20)
    println(result3)

    val result4 = plusFive(10)
    println(result4)

    val result5 = printPlus(10, 20)

    val result6 = plusShort(50, 50)
    println(result6)

    val result7 = plusMany(10, 20, 30, 40, 50)
}