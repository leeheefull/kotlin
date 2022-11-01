package com.leeheefull.kotlin

fun main() {

    var chan = Person("leeheechan", 1997)
    var hong = Person("honggildong", 1812)

    chan.introduce()
    hong.introduce()

}

class Person(var name: String, val age: Int) {

    fun introduce() {
        println("안녕하세요, 이름은 ${name}이고, ${age}년생입니다.")
    }

}