package lesson_3

fun main() {

    val greetingsDay = "Добрый день"
    val greetingsNight = "Доброй ночи"
    val name = "Дмитрий"
    val isDay = false

    val result = if (isDay) {
        "$greetingsDay, $name"
    } else {
        "$greetingsNight, $name"
    }

    println(result)

}