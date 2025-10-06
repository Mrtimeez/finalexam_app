fun main(args: Array<String>) {
    val result : String = randomID()
    println(result)
}

private fun randomID(): String {
    val chars = ('a'..'z')+('A'..'Z')+('0'..'9')
    return List(4) {chars.random()}.joinToString("")
}