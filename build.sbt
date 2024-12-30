scalaVersion := "3.6.2"
name := "stonic-conference"
version := "0.1.0"

libraryDependencies ++= Seq(
  "org.junit.jupiter" % "junit-jupiter-api" % "5.11.4" % Test,
  "org.junit.jupiter" % "junit-jupiter-engine" % "5.11.4" % Test,
  "org.junit.jupiter" % "junit-jupiter-params" % "5.11.4" % Test,
  "org.assertj" % "assertj-core" % "3.27.0" % Test,
  "org.scalatest" %% "scalatest" % "3.2.19" % Test
)
