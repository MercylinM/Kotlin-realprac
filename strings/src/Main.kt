fun main(){
    val city = "lagos"
    println("The capital city of Nigeria is $city")

    val person = "Janet"
    val profession = "architect"

    println(person + " is an " + profession)
    println("$person is an $profession")
//
    nameAndAge("Mercy", 20, )
    val os = "Ubuntu"
    val name = "ubuntu"
    println(os.equals(name))
    val a =""
    val b = " "
    println(a.isBlank())
    println(a.isEmpty())
    println(b.isBlank())
    println(b.isEmpty())

    val fullName = "Pamela Kilonzo"

    println(fullName.startsWith("Pam"))
    println(fullName.endsWith("nzo"))

    var statement = "Phoebe is our class rep."
//    statement = statement.replace("Phoebe", "Vicky")
//    println(statement)

    var words = statement.split("b")
    println(words)
}


fun nameAndAge(name: String, age: Int){
    var year = 2025 - age
    println("$name is $age years old.")
}