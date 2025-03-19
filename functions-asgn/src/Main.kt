fun main(){
    var fullName: String = "Ada"
    var age: Int = 30
    var phoneNumber: String = "+254 713 616 003"
    var weightInKg: Double = 60.0
    var isCitizen: Boolean = true

//    println(printName(fullName))
//    println(printModulus(76, 9))
    printSum(5,6,7,8)
//    println(printFact("I'm a genius"))
    var result = printSum(67,98, 78,88)
    println(result)
}

fun printName(name: String) {
    println ("Hello $name")
}

fun printModulus(num1: Int, num2:Int): Int{
    var modulo = num1 % num2
    return modulo
}

fun printSum(num1: Int, num2: Int, num3: Int, num4: Int): Int {
    var sum = num1 + num2 + num3 + num4
    return sum
}

fun printFact(aboutMe: String): String{
    return aboutMe
}