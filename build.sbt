name := "akka-cluster-example"

version := "1.0"

scalaVersion := "2.12.0"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.0"
libraryDependencies += "com.typesafe.akka" %% "akka-remote" % "2.5.0"
libraryDependencies += "com.typesafe.akka" %% "akka-agent" % "2.5.0"
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.5.0" % "test"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % "2.5.0"
libraryDependencies += "com.typesafe.akka" %% "akka-contrib" % "2.5.0"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api"       % "1.7.7",
  "org.slf4j" % "jcl-over-slf4j"  % "1.7.7"
).map(_.force())

libraryDependencies ~= { _.map(_.exclude("org.slf4j", "slf4j-jdk14")) }
