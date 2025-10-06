class Myclass {
    val class_variable = 20
    fun displayVar() {
        println(class_variable)
    }
}

fun main(args: Array<String>) {
    val myObj = Myclass()
    myObj.displayVar()
}