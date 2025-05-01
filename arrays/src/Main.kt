//fun main() {
//    var friends = arrayOf("Ushi", "Adeday", "Mercy", "Mercylin","Margaret")
//    println(friends.contentToString())
//    println(friends[2])
////    val friend = friends.get(1)
////    println(friend)
//    println(friends::class.simpleName)
////    friends::class.simpleName displays data type
////    println(friends[5])
////    n bound error for accessing an index of array that does not exist
//
////    changing elements in an array
//    friends.set(2, "Rigbe")
//    println(friends.contentToString())
//    friends=friends.plus("Fransisca")
//    friends = friends.plus(arrayOf("Adam", "Eve"))
//    println(friends.contentToString())
//
////    getting the index of particular elements in an array
//    println(friends.indexOf("Mercy"))
//
////    print individual elements on an array with for loop
//    for(friend in friends){
//        println(friend)
//    }
//
////    block variable hold the elements being printed. in this case, friend
//    val years = arrayOf(1995, 1997, 2001, 2013, 2022)
//    val southAfrica = arrayOf("Cyril Ramaphosa", 63210000, false, "Rand", 6022.54)
//    println(southAfrica.contentToString())
//
//    val nums = arrayOf(13,27,31,65,34,21)
//    println(nums.size)
//    println(nums.count())
//    println(nums.average())
//    println(nums.max())
//    println(nums.min())
//
//    for(num in nums){
//        println(num)
//        val square = num * num
//        println("the square of $num is: $square")
//    }
//
////    for each loop
//    friends.forEach { friend -> println(friend) }
//    nums.forEach { num ->
//        val square = num * num
//        println("the square of $num is: $square")
//    }
//
////    sorting array in ascending order
//    val x = nums.sorted()
//    println(x)
//
//    var sortedNums = nums.sortedArray()
//    println(sortedNums.contentToString())
//
//    var sortedFriends = friends.sortedArray()
//    println(sortedFriends.contentToString())
//
////    sorting in descending order
//    sortedNums = nums.sortedArrayDescending()
//    println(sortedNums.contentToString())
//
//    sortedFriends = friends.sortedArrayDescending()
//    println(sortedFriends.contentToString())
//}

fun main() {
    var stringName = "akirachix"
    println(stringName[0])
    println(stringName[2])
    println(stringName[3])

    var stringLength = stringName.length
    println(stringLength)

    var nums = arrayOf(32,17,4,213, 78, 43, 90, 31, 3,73,11,158,62)
    println(nums[1] + nums[4])
    println(nums.indexOf(158))
    println(nums.sortedArray().contentToString())

    correctGrammar()

    nameAndAge("mercy", 23)
    stringLength("length")
    fourStrings("mercy", "hellen", "Bilha", "Ryan;")

}

fun nameAndAge(x: String, y: Int) {

    return println("Hi my name is $x and I am $y years old.")
}

fun stringLength(x: String) {
    return println(x.length)
}

fun fourStrings(x: String, y: String, z: String,w: String) {
    var createdArray = arrayOf(x, y, z, w)
    return println(createdArray.contentToString())
}

fun correctGrammar() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach {
        city ->
        var newCity = city.replaceFirstChar(Char::titlecase )
        println(newCity)
    }

}



