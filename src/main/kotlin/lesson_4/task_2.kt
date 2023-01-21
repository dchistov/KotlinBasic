package lesson_4

fun main() {
    val cargoWeightFirst = 20
    val cargoVolumeFirst = 80
    val cargoWeightSecond = 50
    val cargoVolumeSecond = 100


    println(
        """
        Average для груза с весом ${cargoWeightFirst}кг и обьемом ${cargoVolumeFirst}л:${(cargoWeightFirst >= MIN_WEIGHT_AVERAGE) && (cargoWeightFirst <= MAX_WEIGHT_AVERAGE) && cargoVolumeFirst < VOLUME_AVERAGE}
        Average для груза с весом ${cargoWeightSecond}кг и обьемом ${cargoVolumeSecond}л:${(cargoWeightSecond >= MIN_WEIGHT_AVERAGE) && (cargoWeightSecond <= MAX_WEIGHT_AVERAGE) && cargoVolumeSecond < VOLUME_AVERAGE}
    """.trimIndent()
    )
}

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val VOLUME_AVERAGE = 100