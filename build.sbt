ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "KUP-Assignment-2"
  )

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "test")