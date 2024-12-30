import org.scalatest.matchers.should.Matchers.*

// ADT sum with Sealed Trait
sealed trait ConferenceType
case class Technical(technology: String) extends ConferenceType
case class Environmental(aspect: String, zone: String) extends ConferenceType
case class Medical(specialization: String, disease: String) extends ConferenceType
case object Adhoc extends ConferenceType

// ADT sum usage
def conferenceTypeDescription(conferenceType: ConferenceType): String = conferenceType match
  case Technical(technology) => s"Technical: $technology"
  case Environmental(aspect, zone) => s"Environmental: $aspect, $zone"
  case Medical(specialization, disease) => s"Medical: $specialization, $disease"
  case Adhoc => "Adhoc"

val technology: ConferenceType = Technical("Scala")
conferenceTypeDescription(technology) shouldBe "Technical: Scala"
