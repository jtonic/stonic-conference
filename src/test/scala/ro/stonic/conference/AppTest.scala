package ro.stonic.conference

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import ro.stonic.conference.core.Feed
import ro.stonic.conference.core.Model.ConferenceType

class AppTest extends AnyFunSuite with Matchers:

  test("testFeed"):
    val stonicConference = Feed.stonicConference
    val correctStonicConference = stonicConference.copy(conferenceType = ConferenceType.Technical("Scala/Functional Programming"))
    stonicConference.attendees shouldBe correctStonicConference.attendees
