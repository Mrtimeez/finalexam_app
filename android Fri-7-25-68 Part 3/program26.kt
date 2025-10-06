enum class Day { //ใช้เพื่อเรียงลำดับการใช้ข้อมูล
    SUNDAY, MONDAY, TUESDAY , WEDNESDAY, THURSDAY, FRIDAY , SATURDAY
}
fun main(args: Array<String>) {
    val today = Day.MONDAY
    val activity = when(today){
        Day.SATURDAY, Day.SUNDAY -> "This is weekend"
        else -> "This is Weekday"
    }
    println (activity)
}