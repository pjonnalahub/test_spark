name := "kafka-streaming"
organization := "com.tmus.eng"
version := "0.1"

scalaVersion := "2.11.12"
val sparkVersion = "2.3.4" // for OneData

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false, includeDependency = false)


libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % scalaVersion.value % "provided",
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
  "org.apache.hadoop" % "hadoop-client" % "2.7.3",
  "com.typesafe" % "config" % "1.3.2"
)
