### Sample applicaiton showing issue talked about in <http://stackoverflow.com/questions/15805772/jacoco-plugin-for-sonar-doesnt-support-spock-test> ###

## Steps to reproduce no code coverage
1. download and run sonar 3.6 locally
2. run "mvn clean install sonar:sonar -Dsonar.host.url=http://localhost:9000" from this directory

## To show code coverage being added
1. rename InsignificantTest.javax to InsignificantTest.java
2. rerun the maven command line from above
