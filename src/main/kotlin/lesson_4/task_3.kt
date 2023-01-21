package lesson_4

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val humidity = 20
    val season = "winter"

    val result = isSunny && isAwningOpen && (humidity == 20) && (season != "winter")

    println("Благоприятные ли условия сейчас для роста бобовых: $result")

}