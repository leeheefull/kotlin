package com.leeheefull.kotlin

fun main() {
    var tiger = Tiger()

    tiger.run()
    tiger.eat()
}

interface Runner {

    fun run()

}

interface Eater {

    fun eat() {
        println("냠냠")
    }

}

class Tiger : Runner, Eater {

    override fun run() {
        println("우다다다")
    }

    override fun eat() {
        println("허겁지겁 냠냠")
    }

}