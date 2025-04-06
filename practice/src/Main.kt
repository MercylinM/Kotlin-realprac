fun main() {
//    Int data type
//    there should be a space after a colon when you specify the data type
//    There should be a space before and after an operator
    var count: Int = 2
    println(count)
    println("You have $count unread messages.")
    count++ //incrementing
    println("You have $count unread messages.")
    count--  //decrementing
    println("You have $count unread messages.")

//Create a new program where you define an integer variable for the number of unread emails in an inbox, and initialize it to a value such as 5. You can pick a different number if you'd like. Define a second integer variable for the number of read emails in an inbox. Initialize it to a value such as 100. You can pick a different number if you'd like. Then print out the total number of messages in the inbox by adding the two integer numbers together.

    val unread = 5
    val read = 100
    val messages=unread + read
    println("You have ${unread + read} messages in your inbox.")
    println("You have $unread + $read total messages in your inbox.")
    println("You have $messages messages in your inbox.")

//    Create an integer cartTotal variable that starts at the value 0.
//The user adds a sweater that costs $20 to their shopping cart.
//Update the cartTotal variable to 20, which is the current cost of the items in their shopping cart.
//Print the total cost of the items in their cart, which is the cartTotal variable, to the output.

    var cartTotal = 0
    println("Total: $cartTotal")
    cartTotal = 20
    println(cartTotal)
    println("Total: $cartTotal")

//    Double data type
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")


//    String data type
    val nextMeeting = "Next meeting: "
    val date = "April 10, "
    val location = "at work."
    val reminder = nextMeeting + date + location //concatenation
    println("Say\n \"hello\"") //escaping
    println(reminder)

//    boolean data types
    var notificationsEnabled = true
    println(notificationsEnabled)
    notificationsEnabled = false
    println(notificationsEnabled)
    println("Are notifications enabled? $notificationsEnabled")


//    returns a value, you can store the result in a string variable
    val greeting = birthdayGreeting()
//    println(greeting)
    println(birthdayGreeting(age = 5))
    println(birthdayGreeting("Rex", 2))
}


//functions
fun birthdayGreeting(name: String = "Lover", age: Int = 40): String { //Unit is the default type returned if data type is not defined

//    Each parameter consists of a variable name and data type, separated by a colon and a space. Multiple parameters are separated by a comma
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}