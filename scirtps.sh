#!/bin/bash

mvn clean install -DskipTests
docker build -f DockerfileDB -t moaaddocker/mediumdb .
docker build -f DockerfileApi -t moaaddocker/mediumapi .


docker stack deploy -c docker-compose.yml app