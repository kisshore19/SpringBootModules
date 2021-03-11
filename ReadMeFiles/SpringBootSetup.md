For applicaitonContext.properties we can refere the below document

https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#common-application-properties-data


To run the spring boot application 
    
    java -jar SpringBootModules-0.0.1-SNAPSHOT.jar
  

If you want to see some debug statements while running the applicaiton

    java -jar target/SpringBootModules-0.0.1-SNAPSHOT.jar --debug

Provide different application.yml file to your application 

    java -jar target/SpringBootModules-0.0.1-SNAPSHOT.jar --spring.config.name=application1
    so this will be picked from the class path location
      
Now we are using application.yml file from inside code, by doing this we can not changes the properties whenever it requires
so we need to pass a file name and location while running the application.

    java -jar target/SpringBootModules-0.0.1-SNAPSHOT.jar --spring.config.location=file:///home/kishore/CodeBase/repos/SpringBootModules/application1.yml

    