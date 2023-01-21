package lesson_2

fun main(args: Array<String>) {
    val departureHour = 18
    val departureMinute = 39
    val travelTimeTotalMinute = 457

    val travelTimeHour = travelTimeTotalMinute / 60
    val travelTimeMinute = travelTimeTotalMinute % 60

    var arrivalTimeHour = departureHour + travelTimeHour
    var arrivalTimeMinute = departureMinute + travelTimeMinute

    if (arrivalTimeHour >= 24) {
        arrivalTimeHour %= 24
    }

    if (arrivalTimeMinute >= 60) {
        arrivalTimeHour++
        arrivalTimeMinute %= 60
    }

    println("Время прибытия: ${arrivalTimeHour}:$arrivalTimeMinute")
}