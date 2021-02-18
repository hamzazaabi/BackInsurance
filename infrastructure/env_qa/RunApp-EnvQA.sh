#!/bin/bash
set -xe
docker-compose --project-name Stark_QA_CRM -f /home/docker/deploy-stark-crm-qa/environnement-qa.yml down -v
docker-compose --project-name Stark_QA_CRM -f /home/docker/deploy-stark-crm-qa/environnement-qa.yml up --build -d


echo 'script executed with success !'