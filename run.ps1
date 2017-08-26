param(
$JDKBin     = "C:\Program Files\Java\jdk1.8.0_144\bin\",
$javaFile   = "TripPlannerApp.java",
$javaApp    = "TripPlannerApp"

)

<#
$javaC = join-path $JDKBin "javac.exe"
$java  = join-path $JDKBin "java.exe"
#>

javac.exe $javaFile


java.exe  -cp . $javaApp
