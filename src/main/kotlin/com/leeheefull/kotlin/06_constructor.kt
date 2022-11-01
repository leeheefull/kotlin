package com.leeheefull.kotlin

fun main() {

    var a = Post("Java", "재밌다.")
    var b = Post("Kotlin", "처음입니다.")
    var c = Post("Spring")

}

class Post(var title: String, val content: String) {

    init {
        println("제목 ${this.title}, 내용 ${this.content}")
    }

    constructor(title: String) : this(title, "내용이 없어요") {
        println("보조 생성자가 사용되었습니다.")
    }

}