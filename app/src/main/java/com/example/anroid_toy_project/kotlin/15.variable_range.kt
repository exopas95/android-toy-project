package com.example.anroid_toy_project.kotlin

var number_: Int = 10

class Test(var name: String) {
    fun testFun() {
        name = "홍길동"
        number_ = 100
    }
}

fun main(args: Array<String>) {
    println(number_)

    val test = Test("홍길동")
    test.testFun()
    println(test.name)
    println(number_)

}