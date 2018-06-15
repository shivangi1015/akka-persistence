name := "akka-persistence"

version := "0.1"

scalaVersion := "2.12.6"

val akkaPersistence = "com.typesafe.akka" %% "akka-persistence" % "2.5.4"
val levelDb = "org.iq80.leveldb"            % "leveldb"          % "0.7"
val levelDbJournal = "org.fusesource.leveldbjni"   % "leveldbjni-all"   % "1.8"


libraryDependencies ++= Seq(
  akkaPersistence,
  levelDb,
  levelDbJournal
)