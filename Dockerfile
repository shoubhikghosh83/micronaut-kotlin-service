FROM openjdk:14-alpine
COPY target/micronaut-kotlin-service-0.1.jar app.jar
EXPOSE 8092
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "app.jar"]
