fun main() {
    printAvgAge()

}

fun divide(){
    var x=23.4
    var y=5

    x/=y
    println(x)

}

fun addition(a:Int, b:Int, c:Int){
    var d = a + b + c

    println(d)
}

fun printBestFriend(bestie: String){
    println("My best friend is $bestie.")
}

fun multiply(x:Int, y:Int){

    var product=x*y
    println(product)
}

fun subtract(num1: Int, num2:Int): Int {
    var difference =num1-num2
    return difference
}

fun calcAvgAge(age1:Int, age2:Int, age3:Int):Double{
    var average=(age1+age2+age3)/3.0
    return average
}

fun printAvgAge(){
    val avgAge =calcAvgAge(37,89,65)
    println("The average age of my friends is $avgAge.")
}