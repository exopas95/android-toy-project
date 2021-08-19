package com.example.anroid_toy_project.kotlin

// 1번 문제
// List 두개를 만든다
// 첫 번째 List에는 0부터 9까지 값을 넣는다 (반복문 사용)
// 두 번째 List에는 첫 번째 List의 값을 하나씩 확인한 후
// 짝수면 True, 홀수면 False를 넣어준다

// 2번 문제
// 학점을 구하자
// 80 ~ 90 -> A
// 70 ~ 89 -> B
// 60 ~ 69 -> C
// 나머지 F

// 3번 문제
// 전달 받은 숫자의 각 자리 수의 합을 구하자
// 조건: 전달 받은 숫자는 무조건 두자리 숫자이다.

// 4번 문제
// 구구단을 출력하자

fun main(array: Array<String>) {
    // 1번 문제
    val f_list = mutableListOf<Int>()
    val s_list = mutableListOf<Boolean>()

    for (i in 0 until 10) {
        f_list.add(i)

        if (i % 2 == 0) s_list.add(true)
        else s_list.add(false)
    }
    println(f_list)
    println(s_list)

    // 2번 문제
    val score = 80
    if (score >= 80 && score < 90) println("A")
    else if (score >= 70 && score < 80) println("B")
    else if (score >= 60 && score < 70) println("C")
    else println("F")

    // 3번 문제
    val num = 27
    val s_num = num.toString().toList()
    val s_sum = s_num[0].digitToInt() + s_num[1].digitToInt()
    println(s_sum)

    // 4번 문제
    for (i in 1..9) {
        for (j in 1..9){
            println(i * j)
        }
    }
}