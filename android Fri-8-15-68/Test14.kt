fun main(args: Array<String>) {
    val numbers = ArrayList<Int> ()
    numbers.add(10)
    numbers.add(20)
    numbers.add(30)
    numbers.add(40)
    numbers.add(50)

    //How to print 1
    for(num in numbers){
        print(num)
    }

    //How to print 2
    for(i in 0 until number.size){
        println("Index $i : ${numbers[i]}")
    }

}