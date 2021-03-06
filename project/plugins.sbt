// Play! Framework plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.4")
// Version management plugin
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")
// Docker plugin for sbt-native-packager (included in play plugin)
addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.5.0")
// For those who still wants to use eclipse IDE...
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
// Coverage report
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.0")
// Check code style
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
// Autoformat code
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.16")
