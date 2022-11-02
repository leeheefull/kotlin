package com.leeheefull.kotlin

fun main() {
    var a = Animal("멍멍이", 5, "개")
    var b = Dog("왈왈이", 6)
    var c = Cat("야옹이", 3)

    a.introduce()
    b.introduce()

    b.bark()
    c.meow()
}

open class Animal(var name: String, var age: Int, var type: String) {

    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살입니다.")
    }

}

class Dog(name: String, age: Int) : Animal(name, age, "걔") {

    fun bark() {
        println("멍! 멍!")
    }

}

class Cat(name: String, age: Int) : Animal(name, age, "고영이") {

    fun meow() {
        println("야옹!")
    }

}