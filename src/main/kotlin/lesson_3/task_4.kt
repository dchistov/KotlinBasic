package lesson_3

fun main() {

    var from = "E2"
    var to = "E4"
    var moveStep = 1

    println("[$from-$to;$moveStep]")

    from = "D2"
    to = "D${from.last().digitToInt() + 1}"
    moveStep = 2

    println("[$from-$to;$moveStep]")
}