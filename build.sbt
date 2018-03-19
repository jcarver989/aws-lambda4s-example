scalaVersion := "2.12.4"
name := "aws-lambda4s-example"
organization := "com.jcarver989"
version := "1.0"

mainClass in Compile := Some("lambda4s.example.MainLambda")


// Scala
libraryDependencies += "com.jcarver989" %% "aws-lambda4s" % "1.0"

// Test
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5" % "test"

 // Prevents logging .xml configs causing issues
 assemblyMergeStrategy in assembly := {
   case PathList(ps @ _*) if ps.last == "Log4j2Plugins.dat" => Log4j2MergeStrategy.plugincache
   case PathList("META-INF", "log4j-provider.properties") => MergeStrategy.first
   case PathList("META-INF", xs @ _*) => MergeStrategy.discard
   case x => MergeStrategy.first
 }
