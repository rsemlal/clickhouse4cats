import Dependencies._

ThisBuild / tlBaseVersion := "0.1"

ThisBuild / organization := "com.rsemlal"
ThisBuild / organizationName := "Reda Semlal"
ThisBuild / startYear := Some(2023)
ThisBuild / licenses := Seq(License.Apache2)
ThisBuild / developers := List(
  tlGitHubDev("rsemlal", "Reda Semlal")
)

ThisBuild / crossScalaVersions := ScalaVersions.All
ThisBuild / scalaVersion := ScalaVersions.Scala3 // the default Scala

ThisBuild / githubWorkflowJavaVersions := JavaVersions.All

// publish to s01.oss.sonatype.org (set to true to publish to oss.sonatype.org instead)
ThisBuild / tlSonatypeUseLegacyHost := false

// publish website from this branch
ThisBuild / tlSitePublishBranch := Some("main")

lazy val `clickhouse4cats-root` = project
  .in(file("."))
  .enablePlugins(NoPublishPlugin)
  .aggregate(core)

lazy val core = project
  .in(file("core"))
  .settings(
    name := "clickhouse4cats-core",
    libraryDependencies ++= Seq(
      Libraries.cats,
      Libraries.catsEffect,

      Libraries.munitCore % Test,
      Libraries.munitEffects % Test
    )
  )

lazy val docs = project.in(file("site")).enablePlugins(TypelevelSitePlugin)
