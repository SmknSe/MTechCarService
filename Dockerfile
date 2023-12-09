FROM openjdk:17-jdk

WORKDIR /app

COPY build/libs/MTechCarService-0.0.1-SNAPSHOT.jar ./app.jar
CMD ["java","-jar","app.jar"]