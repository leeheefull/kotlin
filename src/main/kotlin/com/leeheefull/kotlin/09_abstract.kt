package com.leeheefull.kotlin

fun main() {
    var m = KakaoTalk()

    m.talk()
    m.alarm()
}

abstract class Messenger {

    abstract fun alarm()

    fun talk() {
        println("메세지를 보냅니다")
    }

}

class KakaoTalk : Messenger() {
    override fun alarm() {
        println("까톡!")
    }
}