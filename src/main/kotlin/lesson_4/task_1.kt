package lesson_4

fun main() {
    val bookedTableToday = 1
    val bookedTableTomorrow = 13

    println("[Доступность столиков на сегодня: ${bookedTableToday < TOTAL_TABLE}]\n[Доступность столиков на завтра: ${bookedTableTomorrow < TOTAL_TABLE}]")

}

const val TOTAL_TABLE = 13