package com.example.anroid_toy_project.kotlin

class TestAccess{
    private var name : String = "홍길동"
    constructor(name: String) {
        this.name = name
    }

    fun changeName(new_name: String) {
        this.name = new_name
    }

    fun test() {
        println("테스트")
    }
}

class Reward() {
    var rewardAmount: Int = 1000
}

fun main(array: Array<String>) {
    val testAccess: TestAccess = TestAccess("아무개")
    testAccess.test()
//    println(testAccess.name)

    val reward: Reward = Reward()
    reward.rewardAmount = 2000
}