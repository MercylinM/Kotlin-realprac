import javax.swing.text.Style

fun main() {
//    val subaru = Car("Subaru", "Forester", "KDR 223U", 0)
//    println(subaru.make)
//    println(subaru.model)
//    println(subaru.registration)
//    subaru.start()
//    subaru.hoot()
//    println( subaru.speed)
//    subaru.accelerate(90)
//    println( subaru.speed)
//    subaru.decelerate(40)
//    println( subaru.speed)
//    subaru.stop()
//    println( subaru.speed)

    val myShoes = Shoe("Nike", "Blue", 38, "Sneakers")
    val shoes =Shoe("Hush puppies", "Red", 38, "Oxford")

    println(returnAvgMaxAndMin(arrayOf(1,3,5,2,4,5,3)))
    println(nameLength(arrayOf("Mercy", "Muthoni")))
}

class Car(var make: String, var model: String, var registration: String,var speed: Int){
    fun start(){
        println("chogiogiogioook, vroooooome, vroooomee")
    }

    fun accelerate(acceleration: Int){
        speed += acceleration
//        return speed
    }

    fun hoot(){
        println("beep beep")
    }

    fun decelerate(deceleration: Int){
        speed -= deceleration
    }

    fun stop(){
        speed = 0
    }
}

data class Shoe(
    var brand:String,
    var color: String,
    var size:Int,
    var style: String
)

//write a function that returns the average, minimum and maximum value from an integer array
data class Values(var minimum: Int,var maximum: Int, var average: Double)
fun returnAvgMaxAndMin(arr: Array<Int>): Values{
    val avg = arr.sum().toDouble() / arr.size
    val max = arr.sorted().lastIndex
    val min = arr.sorted()[0]

    val values = Values(min, max, avg)
    return values

}

//from my friend group I would like to find out who has the longest and the shortest name and return these z values.
data class Names(var shortest: String, var longest: String)
fun nameLength(array: Array<String>): Names {
    var longest = array[0]
    for (it in array) {
        if (it.length > longest.length){
             longest = it
        }
    }


    var shortest = array[0]
    for (it in array) {
        if (it.length < shortest.length){
            shortest = it
        }
    }


    return Names(shortest, longest)
}


//A doctor has the following attributes: name, registration number, specialization, year of graduation, number of patients treated.
//The doctor has a few methods,
//introduction() - prints out their details
//treatPatient() - treats a patient and increments number of patients treated
//ranking() - prints out the years of experience they have garnered in their specialization
//
//Instantiate doctor and invoke all its methods
class Doctor(var name: String, var registration: String, var specialization: String, var gradYear: Int, var patients: Int){
    fun introduction(){
        
    }
}