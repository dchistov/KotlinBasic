package lesson_2

fun main(args: Array<String>) {
    val employeeCount = 50
    val employeeSalary = 30_000
    val traineeCount = 20
    val traineeSalary = 20_000

    val employeeExpenses = employeeSalary * employeeCount
    val totalExpenses = employeeExpenses + (traineeCount * traineeSalary)
    val avgSalary = employeeSalary + traineeSalary / employeeCount + traineeCount

    println("Основные работники : $employeeCount")
    println("ЗП работников : $employeeSalary")
    println("Стажеры : $traineeCount")
    println("ЗП Стажеров : $traineeSalary")
    println("Расходы на работников : $employeeExpenses")
    println("Расходы работники + стажеры : $totalExpenses")
    println("Средняя ЗП : $avgSalary")


}