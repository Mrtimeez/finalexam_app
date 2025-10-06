
class Car {
    var brand = ""
    var model = ""
    var year = 0
}
fun main(args: Array<String>) {
    var c1 = Car()
    c1.brand = "Toyora"
    c1.model = "Camry"
    c1.year = 2002

    println(c1.brand)
    println(c1.model)
    println(c1.year)
}