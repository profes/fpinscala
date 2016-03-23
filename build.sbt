name := "fpinscala"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-Xlint", "-encoding", "utf8")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.2",
  "com.typesafe.akka" %% "akka-remote" % "2.4.2",
  "com.typesafe.akka" %% "akka-stream" % "2.4.2",
  "com.typesafe.akka" %% "akka-contrib" % "2.4.2",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.2",
  "com.typesafe.akka" %% "akka-cluster" % "2.4.2"

)