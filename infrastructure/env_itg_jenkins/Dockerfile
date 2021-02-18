FROM tomcat:8.5-jre8

WORKDIR /usr/local/tomcat

RUN rm -rf /usr/local/tomcat/webapps/ROOT

ADD crm-application.war ./webapps/ROOT.war

ADD application-itg.properties /usr/local/tomcat/

ADD setenv.sh /usr/local/tomcat/bin/

RUN chmod +x /usr/local/tomcat/bin/setenv.sh

ADD apm-agent.jar /usr/local/tomcat/

CMD ["catalina.sh", "run"]





