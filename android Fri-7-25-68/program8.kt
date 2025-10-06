// Variable Scope
fun myfunction() {
    val my_local = 20
    println(my_local)
}


fun main(args: Array<String>) {
    val local_variable = 10
    println(local_variable)
    myfunction() //เรียกใช้ function
}