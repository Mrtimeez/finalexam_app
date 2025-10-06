fun main(args: Array<String>) {
    val temperature = 30
    if(temperature > 35) {
        println("อากาศร้อนมาก")
    } else if (temperature in 26..35) {
        println("อากาศดี")
    }else{
        println("อากาศเย็น")
    }
}