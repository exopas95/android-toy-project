package com.example.anroid_toy_project.kotlin

// 09. 배열

fun main(array: Array<String>) {
    val one: Int = 1
    val two: Int = 2
    val three: Int = 3
    val four: Int = 4
    val five: Int = 5

    //배열 선언
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)

    // 배열 꺼내기
    println(group1.get(0))

    // 배열 값을 바꾸기
    group1.set(0, 100)
    group1[1] = 1000
    println(group1[0])
    println(group1[1])

    // 배열 선언(2)
    val a1 = intArrayOf(1, 2, 3)
    val c1 = charArrayOf('a', 'b')
    val d1 = doubleArrayOf(1.2, 100.345)
    val b1 = booleanArrayOf(true, false)

    // 배열 선언(3) - lambda
    var a2 = Array(10, { 0 })
    println(a2[9])
}