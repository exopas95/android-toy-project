package com.example.anroid_toy_project.kotlin

// Generic: 타입을 체크하는 기능
// 제너릭은 만들기 어렵고 실제로 만들일이 별로 없기 때문에 사용법만 숙지한다.

fun main(args: Array<String>) {
    // 제너릭을 사용하지 않는 경우
    val list1 = listOf(1, 2, 3, "가")
    val b: String = list1[2].toString()

    // 제너릭을 사용하는 경우
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2] // String 이란 것을 보장 받는다.

    // 강한 타입을 체크할 수 있다.
    val list3 = listOf(1, 2, 3, 4, "가", "나", 3.0)
//    val list4 = listOf<Int>(1, 2, 3, "가") // 강한 타입 체크

    // 제너릭을 사용하지 않은 경우
    // 부모: Any
    // 자식: String, int, Float -> 부모는 자식의 타입이 될 수 있음
    val lsit5 = listOf(1, 2, 3, "가") // -> Any

}