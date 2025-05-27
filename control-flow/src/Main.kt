fun main() {
    categorizeByAge(25)
    categorizeByAge(17)
    categorizeByAge(1)
    categorizeByAge(13)
    categorizeByAge(37)

    greetByCountry("Kenya")
    greetByCountry("Rwanda")
    greetByCountry("Ethiopia")
    greetByCountry("Burundi")
    greetByCountry("Tanzania")

    startWithArticle("apple")
    startWithArticle("table")

    val friends = arrayOf("Mercy", "Njeri", "Muthoni", "Terry")
    for (friend in friends){
        if (friend == "Muthoni" || friend == "Njeri"){
            break
        }
        println("Hi $friend")
    }

    var num = 10
//    while (num > 1){
//        if (num % 2 != 0){
//            println(num)
//        }
//        num--
//    }

    do {
        if (num % 2 != 0){
            println(num)
        }
        num--
    }while (num >= 1)

    balancedString("banana")
    balancedString("Kenya")
    balancedString("BANANA")

    fizzBuzz()
}

fun categorizeByAge(age: Int){
    if (age < 1){
        println("baby")
    }else if (age in 1 ..3){
        println("toddler")
    }else if (age in 3..12){
        println("child")
    }else if (age in 13..17){
        println("teenager")
    }else if (age in 18..35){
        println("youth")
    }else{
        println("old")
    }
}

//write a function that takes in a word and prints it out with the
//correct article. e.g given apple, it prints out 'an apple' and given
//phone it prints out ' a phone'

fun startWithArticle(word: String){
    val vowels = arrayOf('a','e', 'i', 'o', 'u')
    if (vowels.contains(word[0])){
        println("an $word")
    }else{
        println("a $word")
    }
}

fun greetByCountry(country: String){
    when (country) {
        "Rwanda" -> {
            println("Mwiriwe?")
        }
        "Ethiopia" -> {
            println("Salem?")
        }
        "Kenya", "Tanzania" -> {
            println("Habari ya jioni?")
        }
        else -> {
            println("Good Evening?")
        }
    }
}

//A balanced string is one in which the number of vowels equals the
//number of consonants for example "banana" write a function that returns true
//if the string passed is balanced

fun balancedString(word: String){
    val vowels = arrayOf('a','e', 'i', 'o', 'u')
    var countV = 0
    for (char in word.lowercase()){
        if (vowels.contains(char)){
            countV++
        }
    }
    return if (word.length - countV == countV){
        println("$word is a balanced string")
    }else{
        println("$word is not a balanced string")
    }
}

//Write a function that prints out all the numbers between 1 and 1000.
//For multiples of 3 it should print out fizz instead of a number. For
//multiples of 5 it should print out buzz and for multiples of both, it
// should print out fizzbuzz

fun fizzBuzz(){
    for (num in 1..1000){
        if (num % 3 == 0 && num % 5 == 0) {
            println("fizzbuzz")
        }else if (num % 5 == 0){
            println("buzz")
        }else if (num % 3 == 0){
                println("fizz")
        }else{
            println(num)
        }
    }
}