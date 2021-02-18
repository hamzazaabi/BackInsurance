#!/bin/bash
set -xe
docker-compose --project-name CRM-module-preprod -f /home/docker/crm_module/crm_preprod/infrastructure/environnement-preprod.yml down -v
docker-compose --project-name CRM-module-preprod -f /home/docker/crm_module/crm_preprod/infrastructure/environnement-preprod.yml up --build -d

rm -rf ~/crm_module/Stark-JAVA-itg/infrastructure/*
