fun main(args: Array<String>) {
    val fruits = ArrayList<String>()
    
    fruits.add(0,"Apple")
    fruits.add(1,"Bpple")
    fruits.add(2,"Gapple")
    fruits.add(3,"Capple")
    
    fruits[1] = "lemon" //update
    fruits.removeAt(0) //delete

    println("All fruits: $fruits")
}
