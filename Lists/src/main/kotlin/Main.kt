fun main() {
    val colors = listOf("red", "blue", "green", "yellow","orange")

    val friends = mutableListOf("Ada", "Elsa", "Kate", "Debbie", "Faith")

    friends.add("Dianna")
    friends.add("Kelvin")

    println(friends)
    println(colors)

    val nums = listOf(32,456,78,4,621,34,56,89)
    println(nums.size)
    println(nums.count())
    println(nums.max())
    println(nums.min())
    println(nums.average())

    val std1 = Student("Mercy", 25, 1, "Kenya")
    val std2 = Student("Zainab", 21, 56, "Somali")
    val std3 = Student("Regina", 23, 7, "Rwanda")
    val std4 = Student("Leila", 20, 14, "Ethiopia")

    val students = listOf(std4,std3,std2,std1)
//    for (student in students){
//        println(student.name)
//    }

    oddAgeStudents(students)
}


data class Student(
    var name: String,
    var age: Int,
    var codeHiveNo: Int,
    var nationality: String
)

//write a function that takes inna list of students and returns a list of students whose age is odd

fun oddAgeStudents(students: List<Student>): MutableList<Student> {
    val result = mutableListOf<Student>()
    for (student in students){
        if (student.age % 2 == 1){
            println(student)
            result.add(student)
        }
    }
    return result
}

