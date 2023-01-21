package lesson_3

fun main() {

    val name = "Татьяна"
    val patronymic = "Сергеевна"
    val surname = "Сидорова"
    val maidenName = "Андреева"
    val age = 20
    val ageWedding = 22

    val result = """
        [$maidenName $name $patronymic, $age]
        [$surname $name $patronymic, $ageWedding]
    """.trimIndent()

    println(result)


}