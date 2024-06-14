import ro.stonic.conference.core.feed
import ro.stonic.conference.core.model.ConferenceType

val correctStonicConference = feed.stonicConference.copy(conferenceType =
  ConferenceType.Technical("Scala/Functional Programming")
)
