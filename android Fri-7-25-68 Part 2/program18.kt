fun main(args: Array<String>) {
    val temperature = 30
    var answer = if(temperature > 35) {
        "อากาศร้อนมาก"
    } else if (temperature in 26..35) {
        "อากาศดี"
    }else{
        "อากาศเย็น"
    
    }
    println(answer)
}