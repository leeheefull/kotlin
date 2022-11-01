package com.leeheefull.kotlin

fun main() {

    var a = 7;

    // 기본 조건문
    if (a > 10) {
        println("a는 10보다 크다.");
    }

    // when문 사용
    doWhen(a)

}

fun doWhen(a: Any) {
    val result = when(a) {
        1 -> println("정수 1입니다.")
        "chan" -> println("찬입니다.")
        is Long -> println("Long 타입 입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("아무것도 아닙니다.")
    }

    return result
}