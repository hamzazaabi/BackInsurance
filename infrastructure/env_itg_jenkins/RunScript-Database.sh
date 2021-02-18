#!/bin/bash
/opt/mssql-tools/bin/sqlcmd -S 192.168.1.133 -U sa -P Spark-It2020 -i infrastructure/env_itg_jenkins/drop_create_database.sql