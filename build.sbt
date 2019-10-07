resolvers ++= Seq(
  MavenCache("fake-maven", file("fake-maven")),
  Resolver.file("fake-ivy", file("fake-ivy"))(
    Patterns(
      Vector("[orgPath]/[module]/[revision]/[module]-[revision]-ivy.[ext]"),
      Vector("[orgPath]/[module]/[revision]/[artifact]-[revision](-[classifier]).[ext]"),
      isMavenCompatible = false,
      descriptorOptional = false,
      skipConsistencyCheck = true
    )
  )
)

libraryDependencies += "com.fake" % "lib1" % "1.7.27"
