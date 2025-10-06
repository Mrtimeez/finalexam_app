//Comstructor
open class Vehicle(var name: String, var wheels: Int) {
    init{
        println("Vehicle created: $name")
    }
    open fun showInfo(){
        println("Name : $name")
        println("Wheel : @wheels")
    }
}

class Car(name: String, wheels: Int, color: String) : Vehicle(name, wheels){
    overide fun showInfo(){
        super.showInfo()
        println("Color : $color")
    }
}

class Motocycle(name: String, wheels: Int, type: String) : Vehicle(name, wheels){
    overide fun showInfo(){
        super.showInfo()
        println("Type : $")
    }
}

fun main(args: Array<String>) {
    val myVehicle = Vehicle("Genric Vihicle", 4)
    myVehicle.showInfo
}