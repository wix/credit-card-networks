name := "credit-card-networks"
version := "1.3.0-SNAPSHOT"
organization := "com.wix.pay"
licenses := Seq("Apache License, ASL Version 2.0" → url("http://www.apache.org/licenses/LICENSE-2.0"))

scalaVersion := "2.12.6"
crossScalaVersions := Seq("2.11.11", "2.12.6")

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-Xlint",
  "-Xlint:-missing-interpolator")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.specs2" %% "specs2-core" % "3.8.9" % "test",
  "org.specs2" %% "specs2-junit" % "3.8.9" % "test"
)

// Publishing

publishMavenStyle := true
publishArtifact in Test := false
pomIncludeRepository := (_ ⇒ false)
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "content/repositories/releases")
}

pomExtra :=
  <url>https://github.com/wix/credit-card-networks</url>
    <scm>
      <url>git@github.com:wix/credit-card-networks.git</url>
      <connection>scm:git:git@github.com:wix/credit-card-networks.git</connection>
    </scm>
    <developers>
      <developer>
        <id>ohadraz</id>
        <name>Ohad Raz</name>
      </developer>
    </developers>

