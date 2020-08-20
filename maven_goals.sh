
#!/bin/bash
echo showing maven war plugin - using help plugin which prints possible goals and all their parameters
mvn help:describe -DgroupId=org.apache.maven.plugins   -DartifactId=maven-war-plugin   -Ddetail=true 
