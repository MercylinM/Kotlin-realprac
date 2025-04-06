fun main() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")

//fixing errors
    println("New chat message from a friend")
//string template
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
//string concatenation
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

//    message formatting
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

//    basic maths
    val firstNumber = 10
    val secondNumber = 5
    var result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")

    val thirdNumber = 8

    result = add(firstNumber, secondNumber)
    var anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    result = subtract(firstNumber, secondNumber)
    anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")

//    parameters
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
    println(displayAlertMessage(emailId = "sample@com"))
    println(displayAlertMessage(operatingSystem="Mac OS", emailId))

//    pedometer
    val steps = 4000
    val caloriesBurned = pedometerStepsTOCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")


    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}

fun add(firstNumber: Int, thirdNumber: Int): Int{
    return firstNumber + thirdNumber
}

fun subtract(firstNumber: Int, thirdNumber: Int): Int{
    return firstNumber - thirdNumber
}

//default parameters
fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String{
    val message = "There's a new sign-in request on $operatingSystem for your Google Account $emailId.\n"
    return message
}

//pedometer
fun pedometerStepsTOCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

