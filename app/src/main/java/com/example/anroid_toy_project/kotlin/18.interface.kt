package com.example.anroid_toy_project.kotlin

// 인터페이스 = 약속!
// 생성자가 없다! -> 인스턴스화 할 수 없다!
// 네가 이것을 구현하고 싶다면 반드시 아래 기능을 구현해라 라는 지침서!
// 인터페이스도 구현이 있는 함수를 만들 수 있다.
// 구현이 있는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 구현할 필요가 없다.
interface Person_ {
    fun eat(){
        println("먹는다.")
    }
    fun sleep(){
        println("잔다.")
    }
    abstract fun study()
}

class Student_: Person_ {
    override fun study(){}
}

open class Person() {
    fun eat() {}
    fun sleep() {}
}

class Student(): Person() {}

class Teacher(): Person() {}


class SoccerPlayer: Person_ {
    override fun eat() {}
    override fun sleep() {}
    override fun study(){}
}

fun main(args: Array<String>) {
    val student_: Student_ = Student_()
    student_.eat()
    student_.sleep()


}