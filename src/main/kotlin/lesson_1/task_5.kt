package lesson_1

import java.util.*

fun main(args: Array<String>) {
    val seconds = 6480
    val secondsFormat = String.format("%02d", seconds % 60)
    val minute = seconds / 60

    println("$minute:$secondsFormat")


}