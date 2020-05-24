FROM openjdk:8
ADD target/projeto.jar projeto.jar
EXPOSE 42068
ENTRYPOINT ["java", "-jar", "projeto.jar"]