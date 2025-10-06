fun main(args: Array<String>) {
    val score = 85
    val grade = when {
        score >= 90 -> "A+"
        score >= 80 -> "A"
        score >= 70 -> "B"
        else -> "F"
    }
    println(grade)
}