#!/bin/bash
set -xe

docker-compose --project-name Stark_Recette_CRM -f /home/docker/deploy-stark-crm-recette/environnement-recette.yml down -v
docker-compose --project-name Stark_Recette_CRM -f /home/docker/deploy-stark-crm-recette/environnement-recette.yml up --build -d

echo 'script executed with success !'