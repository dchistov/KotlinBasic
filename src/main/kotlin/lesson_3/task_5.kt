package lesson_3

fun main() {

    val inputString = "D2-D4;0"

    val from = inputString.split("[-;]".toRegex())[0]
    val to = inputString.split("[-;]".toRegex())[1]
    val moveStep = inputString.split("[-;]".toRegex())[2]

    println("$from $to $moveStep")
}