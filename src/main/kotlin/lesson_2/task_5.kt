package lesson_2

import kotlin.math.pow

fun main() {
    val depositAmount = 70_000
    val percentYear = 16.7
    val term = 20

    val result = String.format("%.3f", depositAmount * (1+(percentYear/100)).pow(term))

    println(result)
}