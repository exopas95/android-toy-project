package com.example.anroid_toy_project.kotlin

// 1) 사칙 연산을 수행할 수 있는 클래스
class Calculate() {
    fun add_num(a: Int, b: Int): Int {
        val result = a + b
        return result
    }
    fun sub_num(a: Int, b: Int): Int {
        val result = a - b
        return result
    }
    fun mul_num(a: Int, b: Int): Int {
        val result = a * b
        return result
    }
    fun div_num(a: Int, b: Int): Int {
        val result = a / b
        return result
    }
}

class Calculate2() {
    fun add_num(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {Int
            result += it
        }
        return result
    }
    fun sub_num(vararg numbers: Int): Int {
        var result: Int = 0
        for (i in 0 until numbers.size) {
            result -= numbers[i]
        }
        return result
    }
    fun mul_num(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {Int
            if (it!=0){
                result *= it
            }
        }
        return result
    }
    fun div_num(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed{index, value ->
            if(index!=0 && value != 0) result /= value
        }
        return result
    }
}

// 2) 은행 계좌 만들기
//      - 계좌 생성 기능 (이름, 생년월일)
//      - 잔고를 확인하는 기능
//      - 출금 기능
//      - 예금 기능

// 3) TV 클래스
//      - on / off 기능
//      - 채널을 돌리는 기능
//      - 초기 채널은 (S사 M사 K사 3개)

fun main(array: Array<String>) {
    val calculator = Calculate()
    println(calculator.add_num(1, 2))
    println(calculator.sub_num(1, 2))
    println(calculator.mul_num(1, 2))
    println(calculator.div_num(1, 2))
}