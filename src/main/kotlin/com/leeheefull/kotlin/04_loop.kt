package com.leeheefull.kotlin

fun main() {

    var a = 0

    // while문
    while (a < 5) {
        print(" " + a++)
    }
    println()

    // do-while문
    do {
        print(" " + a--);
    } while (a > 0)
    println()

    // for문
    for (i in 0..9 step 3) {
        print(" $i")
    }
    println()

    // downTo 키워드
    for (i in 9 downTo 0) {
        print(" $i")
    }
    println()

}