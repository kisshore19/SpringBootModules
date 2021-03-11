#Docker file
FROM java:8
#VOLUME /tmp /home/kishore/CodeBase/repos/SpringBootModules
COPY target/SpringBoot*.jar run.jar
COPY application1.yml /tmp/application1.yml
ENTRYPOINT ["java","-jar","/run.jar","--spring.config.location=file:///tmp/application1.yml"]
#ENTRYPOINT ["java","-jar", "run.jar"]