package ro.stonic.conference.core.model

// --------------------------------------------
// value classes
// --------------------------------------------
class ZipCode(val value: String) extends AnyVal
class Price(val value: Double) extends AnyVal
class Email(val value: String) extends AnyVal
class Phone(val value: String) extends AnyVal

// --------------------------------------------
// type aliases
// --------------------------------------------
type Description = String | Null // nullable using union types
type Contact = (Email, Phone) // tuple type

// --------------------------------------------
// enums (ADT sum types)
// --------------------------------------------
enum ConferenceType:
  case Technical(technology: String)
  case Environmental(aspect: String, zone: String)
  case Medical(specialization: String, disease: String)

enum TicketType:
  case Free
  case Paid(price: Price)

enum SponsorshipType:
  case Platinum(price: Price)
  case Gold
  case Silver

// --------------------------------------------
// case classes (ADT product types)
// --------------------------------------------
case class Address(street: String, city: String, country: String, zipCode: ZipCode)

case class Organization(name: String, address: Address, contact: Contact)

case class Venue(name: String, address: Address, capacity: Int)

case class Speaker(name: String, organization: Organization, contact: Contact)

case class Talk (title: String, description: Description, speakers: List[Speaker], duration: Int)

case class Workshop(title: String, description: Description, speakers: List[Speaker], duration: Int, capacity: Int)

case class Attendee(name: String, contact: Option[Contact], ticketType: TicketType)

case class Sponsor(name: String, sponsorshipType: SponsorshipType)

case class Conference(
  name: String,
  organization: Organization,
  conferenceType: ConferenceType,
  venue: Venue,
  contact: Contact,
  attendees: List[Attendee],
  speakers: List[Speaker],
  talks: List[Talk],
  workshops: List[Workshop],
  sponsors: List[Sponsor],
  geolocation: Option[(Double, Double)] = None
)
