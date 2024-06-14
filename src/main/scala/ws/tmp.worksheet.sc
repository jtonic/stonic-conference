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
