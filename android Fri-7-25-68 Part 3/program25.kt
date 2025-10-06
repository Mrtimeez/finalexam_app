fun main(args: Array<String>) {
    val myData : Any = 42
    When (myData) {
        is Int -> println ("เป็นเลขจำนวนเต็ม")
        is String -> println("เป็นข้อความ")
        is Double -> println("ตัวเลขทศนิยม")
        else -> println("ไม่รู้จักข้อมูลนี้")
    }
}