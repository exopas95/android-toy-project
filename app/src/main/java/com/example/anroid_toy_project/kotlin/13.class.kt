package com.example.anroid_toy_project.kotlin

// 13. Class

// OOP -> 객체지향 프로그래밍
// 객체 -> 이름이 있는 모든 것
// - 객체를 만들고 그 객체에게 일을 시켜서 문제를 해결한다.
// - 선수, 심판, 경기장, 관중 -> 축구 게임

// 클래스 만드는 방법 (1)
class Car(var engine : String, var body : String) {

}

// 클래스 만드는 방법 (2)
class SuperCar {
    var engine : String
    var body : String
    var door : String

    constructor(engine : String, body : String, door : String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스 만드는 방법 (3) -> 1번 방법의 확장
class Car1(engine: String, body: String) {
    var door: String = ""

    constructor(engine: String, body: String, door: String):this(engine, body){
        this.door = door
    }
}

// 클래스 만드는 방법 (4) -> 2번 방법의 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }
    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunnableCar(engine: String, body: String) {

    fun ride() {
        println("탑승 하였습니다.")
    }

    fun drive () {
        println("달립니다.")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

class RunnableCar2{
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    init {
        // 초기 세팅을 할 때 유용하다.
        println("RunnableCar2 is created")
    }

    fun ride() {
        println("탑승 하였습니다.")
    }

    fun drive () {
        println("달립니다.")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

// 오버로딩 - 이름이 같지만 받는 파라미터가 다른 함수
class TestClass() {
    fun test(a: Int) {
        println("up")
    }
    fun test(a: Int, b: Int) {
        println("up")
    }
}

fun main(array: Array<String>) {
    // Instance
    val bigCar = Car("v8 engine", "big")

    // 클래스는 자료형이 된다.
    val bigCar1 : Car = Car("v8 engine", "big")

    val superCar : SuperCar = SuperCar("good engine", "big", "white")

    val runnableCar: RunnableCar = RunnableCar("simple engine", "simple door")

    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    runnableCar.ride()
    runnableCar.navi("부산")
    runnableCar.drive()

    // 인스턴스의 멤버 변수에 접근하는 방법
    val runnableCar2: RunnableCar2 = RunnableCar2("nice engine", "long body")

    println(runnableCar2.body)
    println(runnableCar2.engine)
}