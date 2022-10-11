package com.leeheefull.kotlin

fun main() {

    /**
     * 정수
     */
    val intValue: Int = 1234
    val longValue: Long = 1234L
    val intValueByHex: Int = 0x1af
    val intValueByBin: Int = 0b010101101
    // 8진수 지원하지 않음.

    println(intValue)
    println(longValue)
    println(intValueByHex)
    println(intValueByBin)


    /**
     * 소수
     */
    val doubleValue: Double = 123.5
    val doubleValueWithExp: Double = 123.5e10
    val floatValue: Float = 123.5f

    println(doubleValue)
    println(doubleValueWithExp)
    println(floatValue)


    /**
     * 문자
     */
    val charValue: Char = 'a'
    val korCharValue: Char = '가'

    println(charValue)
    println(korCharValue)


    /**
     * 논리 값
     */
    val booleanValue: Boolean = true

    println(booleanValue)


    /**
     * 문자열
     */
    val stringValue: String = "문자열입니다."
    val multiLineStringValue: String = """
        이것은 멀티 라인 문자열입니다.
            신기하죠?
        
        ㅋㅋㅋ
    """.trimIndent()

    println(stringValue)
    println(multiLineStringValue)

}