FROM openjdk:14-alpine
COPY target/*.jar app.jar
EXPOSE 8092
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "app.jar"]
