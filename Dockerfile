FROM openjdk:14-alpine
COPY target/micronaut-kotlin-service-*.jar micronaut-kotlin-service.jar
EXPOSE 8092
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-kotlin-service.jar"]
