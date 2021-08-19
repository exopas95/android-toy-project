package com.example.anroid_toy_project.kotlin

open class CarBasic(){
    open fun drive(): String {
        return "달린다."
    }

    fun stop() {

    }
}

class SuperCarBasic(): CarBasic(){
    // 오버로딩: 같은 이름의 메서드 여러개를 가지면서 매개변수의 유형과 개수를 다르게 하는 기
    // 상속할때 상위 클래스가 가지고 있는 매서드를 하위 클래스가 재정의해서 사용
    override fun drive(): String {
        // 부모의 drive
        val run = super.drive()
        return "빨리 $run"
//        super.drive()
    }
}

class BusBasic() {

}

fun main(args: Array<String>) {
    val superCar: SuperCarBasic = SuperCarBasic()
    println(superCar.drive())
    superCar.stop()
}