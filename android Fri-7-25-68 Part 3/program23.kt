fun main(args: Array<String>) {
    val dayofweek = 1 
    val answer = when(dayofweek) {
        in 2..6 -> "We are in the office"
        1, 7 -> "We are on our vacation"
        else -> "Invalid"
    }
    println("$answer")
}