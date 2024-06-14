import scala.compiletime.ops.double
import java.time.ZonedDateTime
case class Address(street: String, city: String, country: String, zipCode: String)

val whiteHouse = Address("1600 Pennsylvania Ave NW", "Washington", "USA", "20501")
whiteHouse.street // 1600 Pennsylvania Ave NW

// create a new address with the correct zip code
val correctAddress = whiteHouse.copy(zipCode = "20500")

// destructuring
val Address(street, city, _, _) = correctAddress

// pattern matching
whiteHouse match
  case Address(_, "Washington", "USA", _) => "Washington DC"
  case Address(_, "Bucharest", "Romania", _) => "Bucharest"
  case _ => "Unknown Location"


// --------------------------------------------
// enums (ADT sum types)
// --------------------------------------------

//defining an enum
enum TicketType:
  case Free
  case Paid(price: Double)
  case EarlyBird(price: Double, expires: ZonedDateTime)

//using the enum

val freeTicket = TicketType.Free
val paidTicket = TicketType.Paid(100.0)

//pattern matching
def ticketPrice(ticket: TicketType): Double = ticket match
  case TicketType.Free => 0.0
  case TicketType.Paid(price) => price

import org.scalatest.matchers.should.Matchers.*

ticketPrice(freeTicket) shouldBe 0.0// 0.0
