#!/bin/bash
set -xe
docker-compose --project-name Stark_ITG_CRM -f /home/docker/deploy-stark-crm-itg/environnement-integration.yml down -v
docker-compose --project-name Stark_ITG_CRM -f /home/docker/deploy-stark-crm-itg/environnement-integration.yml up --build -d


echo 'script executed with success !'