package one.digitalinnovation.collections

fun main() {

    val Josue = funcionary(name = "Josue", salary = 2000.0, ContractType = "CLT")
    val Pedro = funcionary(name = "Pedro", salary = 1500.0, ContractType = "PJ")
    val María = funcionary(name = "María", salary = 4000.0, ContractType = "CLT")

    val Repository = Repository<funcionary>()

    Repository.create(Josue.name, Josue)
    Repository.create(Pedro.name, Pedro)
    Repository.create(María.name, María)

    println("\nA - Find One")
    println(Repository.findByid(Josue.name))

    println("\nB - Find One")
    println(Repository.findByid(María.name))

    println("\nC - Find ALL")
    Repository.findall().forEach {println(it)}

    println("\nC - Remove One")
    Repository.remove(María.name)
    Repository.findall().forEach {println(it)}
}