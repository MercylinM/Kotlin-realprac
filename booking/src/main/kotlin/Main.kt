data class Passenger(
    var name: String,
    var identification: String
)

data class Ticket(
    var name: String,
    var identification: String,
    var departure: String,
    var destination: String,
    var seat: Int,
    var date: String,
    var registration: String,
    var fare: Double
)

class Bus(
    var registration: String,
    var capacity: Int,
    var bookedSeat: Int
){
    var takenSeats = mutableListOf<Int>(1, 3, 4, 6, 10)

    fun book(
        passenger: Passenger,
        departure: String,
        destination: String,
        date: String,
        seat: Int
    ): Ticket?{
        if (capacity == bookedSeat){
            println("No available seats")
            return null
        }else if (takenSeats.contains(seat)){
            println("seat $seat already taken")
            return null
        }else{

            val ticket = Ticket(
                passenger.name,
                passenger.identification,
                departure,
                destination,
                seat,
                date,
                registration,
                fare = 5000.0 )
            takenSeats.add(seat)
            bookedSeat++
            return ticket
        }
    }

    fun printTicket(ticket: Ticket){
        println(ticket)
    }
}

fun main(){
    val passenger = Passenger("Mercy", "12345678")
    val bus = Bus("KCR 234U", 12, 5)
    val ticket = bus.book(
        passenger,
        "12.00",
        "Nairobi",
        "12/4/2025",
        2, )
    bus.printTicket(ticket!!)
}