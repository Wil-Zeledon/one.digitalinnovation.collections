package one.digitalinnovation.collections

fun main() {

    val names = Array<String>(size = 3) {""}
    names [0] = "MARIA"
    names [1] = "ZAZA"
    names [2] = "JOSE"


    println("\n")
    println("A\n")
    for (name in names) {
        println(name)
    }

    println("\n")
    println("B\n")
    names.forEach {
        println(it)
    }

    println("\n")
    println("C\n")
    names.forEach { name ->
        println(name)
    }

    println("\n")
    println("D\n")
    for (index in names.indices) {
        println(names  [index])
    }

    println("\n")
    println("E\n")
    names.sort()                       //FOR ORDER THE LIST
    for (name in names) {
        println(name)
    }

    val values = arrayOf("CARLOS", "PEDRO", "WIL",)     //FOR ARRAY OF

    println("\n")
    println("F\n")
    values.sort()                       //FOR ORDER THE LIST
    for (valor in values) {
        println(valor)
    }

}

