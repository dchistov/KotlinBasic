package lesson_4

fun main() {

    println("Есть ли повреждения корпуса?")
    val isDamageBodyShip: Boolean = readln().toBoolean()

    println("Текущая численность экипажа")
    val crewCount = readln().toInt()

    println("Текущее количество ящиков провизии")
    val provisionsCount = readln().toInt()

    println("Благоприятные метеоусловия?")
    val isWeatherConditions = readln().toBoolean()

    println(isDamageBodyShip)
    println(crewCount)
    println(provisionsCount)
    println(isWeatherConditions)

    println("Сможет ли корабль отправиться?: ${(!isDamageBodyShip && (crewCount in CREW_COUNT_MIN until CREW_COUNT_MAX) && provisionsCount > PROVISIONS_COUNT_MIN) || (isDamageBodyShip && crewCount == CREW_COUNT_MAX && isWeatherConditions && provisionsCount > PROVISIONS_COUNT_MIN)}")
}

const val CREW_COUNT_MIN = 55
const val CREW_COUNT_MAX = 70
const val PROVISIONS_COUNT_MIN = 50