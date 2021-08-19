package com.example.anroid_toy_project.kotlin

// 11. Iterable

fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // Method 1
    for (item in a) {
        if(item == 5) {
            println("item is Five")
        }
        else println("item is not Five")
    }

    // Method 2
    for ((index, item) in a.withIndex()){
        println("index: " + index + " value: " + item)
    }

    // Method 3
    a.forEach{Int
        println(it)
    }

    // Method 4
    a.forEach{item ->
        println(item)
    }

    // Method 5
    a.forEachIndexed { index, item ->
        println("index: " + index + " value: " + item)
    }

    // Method 6
    for ( i in 0 until a.size) {
        println(a.get(i))
    }

    // Method 7
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }

    // Method 8
    for (i in a.size-1 downTo(0) step(2)) {
        println(a.get(i))
    }

    // Method 9
    // .. -> 마지막을 포함한다.
    for (i in 0..10) {
        println(i)
    }

    // Method 10
    var b: Int = 0
    var c: Int = 4

    while (b < c) {
        b++
        println(b)
    }

    do{
        println("hello")
    } while(b < c)
}