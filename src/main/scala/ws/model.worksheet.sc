import ro.stonic.conference.core.Feed
import ro.stonic.conference.core.Model.ConferenceType

val correctStonicConference = Feed.stonicConference.copy(conferenceType =
  ConferenceType.Technical("Scala/Functional Programming")
)
