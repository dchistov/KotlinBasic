package lesson_4

fun main() {
    val trainingDayCount = 2
    val arms = trainingDayCount % 2 != 0
    val abdominalMuscles = trainingDayCount % 2 != 0
    val legs = trainingDayCount % 2 == 0
    val backMuscles = trainingDayCount % 2 == 0

    println(
        """
        Упражнения для рук:     $arms
        Упражнения для ног:     $legs
        Упражнения для спины:   $backMuscles
        Упражнения для пресса:  $abdominalMuscles
    """.trimIndent()
    )
}