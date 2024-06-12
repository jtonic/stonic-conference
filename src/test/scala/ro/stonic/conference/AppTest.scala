package ro.stonic.conference

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class AppTest extends AnyFunSuite with Matchers:

  test("testFeed"):
    import ro.stonic.conference._

    val stonicConference = Feed.stonicConference
    val correctStonicConference = stonicConference.copy(conferenceType = ConferenceType.Technical("Scala/Functional Programming"))
    stonicConference.attendees shouldBe correctStonicConference.attendees
