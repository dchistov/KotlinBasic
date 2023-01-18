package lesson_2

fun main(args: Array<String>) {
    val crystalOre = 7
    val ironOre = 11
    val bonusBuffPercent = (20 / 100f)
    val bonusCrystalOre = bonusBuffPercent * crystalOre
    val bonusIronOre = bonusBuffPercent * ironOre

    println("Кристалическая руда: ${bonusCrystalOre.toInt()}")
    println("Железная руда: ${bonusIronOre.toInt()}")

}