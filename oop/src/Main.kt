fun main() {
    val subaru = Car("Subaru", "Forester", "KDR 223U", 0)
    println(subaru.make)
    println(subaru.model)
    println(subaru.registration)
    subaru.start()
    subaru.hoot()
    println( subaru.speed)
    subaru.accelerate(90)
   println( subaru.speed)
    subaru.decelerate(40)
    println( subaru.speed)
    subaru.stop()
    println( subaru.speed)
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