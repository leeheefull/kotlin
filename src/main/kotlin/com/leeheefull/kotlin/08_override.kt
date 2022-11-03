package com.leeheefull.kotlin

fun main() {
    var h = Ferrari()

    h.eat()
}

open class Car {

    open fun eat() {
        print("전진합니다.")
    }

}

class Ferrari: Car() {

    override fun eat() {
        print("엄청 빠릅니다")
    }

}