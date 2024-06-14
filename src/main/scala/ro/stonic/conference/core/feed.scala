package ro.stonic.conference.core.feed

import ro.stonic.conference.core.model.{
  Address,
  ZipCode,
  Organization,
  Email,
  Phone,
  Speaker,
  Attendee,
  TicketType,
  Sponsor,
  SponsorshipType,
  Price,
  Conference,
  ConferenceType,
  Venue,
  Workshop,
  Talk,
}

val address =
  Address("Bulevardul Unirii", "Bucharest", "Romania", ZipCode("030167"))

// organizations
private val stonic =
  Organization("STonic", address, (Email("stonic@aaa"), Phone("7777777777777")))
private val epl =
  Organization("EPL", address, (Email("epl@aaa"), Phone("111111111111")))
private val prop =
  Organization("Propr", address, (Email("prop@aaa"), Phone("222222222222")))

// speakers
val marO = Speaker("Mar O", epl, (Email("mo@aaa.com"), Phone("3333333333")))
val jd = Speaker("John D", prop, (Email("jd@aaa.com"), Phone("5678901234")))
val speakers = List(marO, jd)

// attendees
val johnDoe = Attendee(
  "John Doe",
  Some((Email("jd@aaa.com"), Phone("2345678901"))),
  TicketType.Paid(Price(100.0))
)
val janeDoe = Attendee("Jane Doe", None, TicketType.Free)

// sponsors
val ig = Sponsor("IG", SponsorshipType.Platinum(Price(10_000_000)))
val zic = Sponsor("ZIO", SponsorshipType.Gold)
val sc = Sponsor("scala-center", SponsorshipType.Gold)

// conference
val stonicConference = Conference(
  name = "Stonic Conference",
  organization = stonic,
  conferenceType = ConferenceType.Technical(technology = "Scala"),
  venue = Venue("Stonic HQ", address, 100),
  contact = (Email("qqq@aaa.com"), Phone("1234567890")),
  attendees = List(johnDoe, janeDoe),
  speakers = speakers,
  talks = List(
    Talk(
      "ZIO",
      "ZIO is a type-safe, composable library for async and concurrent programming in Scala",
      List(jd),
      10
    ),
    Talk(
      "Simple Scala",
      "Simple Scala is a type-safe, composable library for async and concurrent programming in Scala",
      List(marO),
      120
    )
  ),
  workshops = List(
    Workshop(
      "ZIO",
      "ZIO is a type-safe, composable library for async and concurrent programming in Scala",
      List(jd),
      10,
      100
    ),
    Workshop(
      "Simple Scala",
      "Simple Scala is a type-safe, composable library for async and concurrent programming in Scala",
      List(marO),
      120,
      100
    )
  ),
  sponsors = List(ig, zic, sc)
)
