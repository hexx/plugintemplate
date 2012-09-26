organization := "plugintemplate"

name := "plugintemplate"

version := "0.1.0"

scalaVersion := "2.10.0-M7"

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _)
