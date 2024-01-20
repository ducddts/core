FROM openjdk11:jre-11.0.6_10-alpine

COPY target/*-included-dependencies.jar /usr/app/core.jar

CMD ["java", "-jar", "/usr/app/core.jar"]

