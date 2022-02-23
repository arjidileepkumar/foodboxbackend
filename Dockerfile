FROM openjdk:8
EXPOSE 8087
ADD target/springdocker.jar springdocker.jar
ENTRYPOINT ["java","-jar","/springdocker.jar"]