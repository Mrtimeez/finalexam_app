fun main(args: Array<String>) {
    val numbers = listOf(1,2,3,4,5)
    for(number in numbers) {
        val result = if(number % 2 == 0) "คู่" else "คี่"
        println("$number เป้นเลขจำนวนเต๊ม $result")
    }
}