FROM tomcat:8.5-jre8

WORKDIR /usr/local/tomcat

RUN rm -rf /usr/local/tomcat/webapps/ROOT

ADD crm-application.war ./webapps/ROOT.war

ADD application-recette.properties /usr/local/tomcat/

CMD ["catalina.sh", "run"]