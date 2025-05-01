fun main() {
    val result = organizeWallet(arrayOf(100, 50, 200, 1000, 20, 100))
    println(result.contentToString())
    println(isPalindromic("Hannah"))
    println(isPalindromic("Mariam"))

    println(estimateShippingCost(36,42,2200, 1800, 16.75))

    println(isPasswordValid("123wordpass"))
    println(isPasswordValid("123password"))
    println(isPasswordValid("1253wordpass"))
}

fun organizeWallet(notes: Array<Int>): Array<Int>{
    return notes.sortedArray()
}

fun isPalindromic(name: String): Boolean{
//    return name.lowercase() === name.lowercase().reversed()
    val lname = name.lowercase()
    var l = 0
    var r = lname.length-1

    while (l < r){
        if (lname[l] == lname[r]){
            l++
            r--
        }
        else{
            return false
        }
    }
    return true
}

fun estimateShippingCost(diameterA: Int, diameterB: Int, numA: Int, numB: Int,rate: Double): Double{
    val pi = 3.14159
    val radiusA = diameterA / 200.0
    val radiusB = diameterB / 200.0
    val typeAVol = (4.0/3) * pi * radiusA * radiusA * radiusA * numA
    val typeBVol = (4.0/3) * pi * radiusB * radiusB * radiusB * numB

    val totalVal = typeAVol + typeBVol
    return totalVal * rate
}

fun calcSphereVolume(radius: Double): Double{
    val pi = 3.14159
    return  (4/3) * pi * radius * radius * radius
}

fun isPasswordValid(userPassword: String): Boolean{
    var badpass = "password123".lowercase()
    badpass = badpass.toCharArray().sorted().joinToString("")
    val sortedPassword = userPassword.lowercase().toCharArray().sorted().joinToString("")

    return badpass != sortedPassword
//    if(badpass == sortedPassword){
//        return false
//    }else{
//        return true
//    }
}
class Menuitem(name:String,price:Double,cusine:String){
    fun itemBelowPrice(){
        val certainPrice = 1200.0
        val greater = Menuitem.filter{ it.price > certainPrice}
        return greater
    }
}