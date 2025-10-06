fun main(args: Array<String>) {
    val dayofweek = 3 
    val dayName = when(dayofweek) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "thurday"
        6 -> "friday"
        7 -> "Saturday"
        else -> "Invalid"
    }
    println("Today is $dayName")
}