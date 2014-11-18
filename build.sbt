name := "select2Example"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

libraryDependencies += "postgresql" % "postgresql" % "9.1-901-1.jdbc4"