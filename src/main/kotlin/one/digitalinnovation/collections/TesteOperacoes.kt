package one.digitalinnovation.collections

fun main() {

    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println("\nA")
    salarios.sort()                       //FOR ORDER THE LIST

    salarios.forEach { println (it) }

    println("\nB")
    println("The Max salary is: ${salarios.maxOrNull()}")
    println("The Min salary is: ${salarios.minOrNull()}")
    println("The Average Salary is: ${salarios.average()}")
    println("The Salaries greater than 2,250.0 is/are: ${salarios.filter {it>2500.0}}")

    println("\nC")
    println(salarios.count{it in 2000.0..5000.0 })

    println("\nD")
    println(salarios.find { it == 2250.0 })

    println("\nE")
    println("Do you found the quantity of salary about 500.0?: " + salarios.find { it == 500.0 })

    println("\nF")
    println("Do you found the quantity of salary about 1000.0?: " + salarios.any { it == 1000.0 })

    println("\nG")
    println("Do you found the quantity of salary about 500.0?: " + salarios.any { it == 500.0 })
}
