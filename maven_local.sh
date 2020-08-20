
#!/bin/bash
echo when calling this jar keep the scope as system
mvn install:install-file –Dfile=/Users/mukeshbasira/Desktop/ps.jar -DgroupId=com.ps.tutorial -DartifactId=ps-app -Dpackaging=jar -Dversion=1.0
