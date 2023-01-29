FROM amazoncorretto:11-alpine-jdk  
MAINTAINER maiteCabrera
COPY tarjet/maiteCabrera-0.0.1-SNAPSHOT.jar maiteCabrera-app.jar
ENTRYPOINT ["java", "-jar", "/maiteCabrera-app.jar"]
