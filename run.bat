java -jar sl-build-scanner.jar -pom -configfile slmaven-auto.json -workspacepath .
pause
call "C:\Program Files\maven\apache-maven-3.6.2\bin\mvn.cmd" test -DrunFunctionalTests=true -Dmaven.test.failure.ignore=true
pause
java -jar sl-build-scanner.jar -restore -workspacepath . 