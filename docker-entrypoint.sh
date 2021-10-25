#!/usr/bin/env bash

echo 'Running : java ' $JVM_ARGS '-DPUBLIC_PORT=8080 -jar app.jar'
exec java $JVM_ARGS -DPUBLIC_PORT=8080 -Dspring.profiles.active=prod -jar app.jar
