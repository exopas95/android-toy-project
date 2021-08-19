package com.example.anroid_toy_project.kotlin

// 10. Collection
// - list, set, map (수정 불가: immutable)
// - (수정 가능: mutable)


fun main(args: Array<String>){

    // list
    val numberList = listOf<Int>(1, 2, 3)
    println(numberList)
    println(numberList.get(0))

    // set
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    numberSet.forEach{Int
        println(it)
    }

    // map: key - value
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap)
    println(numberMap.get("one"))

    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4)
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1, "two" to 2)
    mNumberMap.put("two", 3)
    println(mNumberMap)
}