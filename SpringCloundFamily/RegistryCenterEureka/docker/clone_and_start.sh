#!/bin/bash
kill -9 `cat $PROJECT_PATH/target/app.pid`
git clone $PROJECT_GIT
mvn install $PROJECT_PATH/pom.xml
nobup java -jar $PROJECT_PATH/target/$PROJECT_NAME.jar
