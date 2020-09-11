#!/bin/bash

docker build -t RegistryCenterEureka:dev .

docker run -it --name RegistryCenterEureka -p 8761:8761 -v /home/heath/docker/java/project:/opt/java/project RegistryCenterEureka:dev 