# spring-boot-template
spring boot restful application:

### project 
A template project include:

1. mvc framwork: spring
2. DB: mysql
3. cache: redis
4. search engin: ES

### startup

start up commandLine

1. mvn clean package
2. run by different env:

dev:
java -jar target/spring-boot-template-0.1.0.jar 

staging:
java -jar target/spring-boot-template-0.1.0.jar --spring.profiles.active=staging

online 
java -jar target/spring-boot-template-0.1.0.jar --spring.profiles.active=online
