name := "log4s-cats"
organization := "com.mscharley"
scalaVersion := "2.12.2"

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature",
  "-Ypartial-unification",
  "-P:acyclic:force"
)

dependencyUpdatesFailBuild := true

val AcyclicVersion = "0.1.7"
autoCompilerPlugins := true
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.4")
addCompilerPlugin("com.lihaoyi"    %% "acyclic"        % AcyclicVersion)

libraryDependencies ++= Seq(
  "org.typelevel"  %% "cats"           % "0.9.0",
  "org.log4s"      %% "log4s"          % "1.3.5",
  "org.typelevel"  %% "cats-effect"    % "0.3" % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "test",
  "com.lihaoyi"    %% "acyclic"        % AcyclicVersion % "provided"
)
