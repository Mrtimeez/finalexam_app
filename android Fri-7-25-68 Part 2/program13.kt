fun main(args: Array<String>) {
    print("How old are you?")
    val age = readLine()?.toIntOrNull() // ?.toIntOrNull() แปลงเป็นค่า int และแปลงเป็น null ได้
    if(age != null){
        println("I am $age year old")
    }else {
        println("It is invalid number")
    }
}