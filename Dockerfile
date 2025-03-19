FROM openjdk:21-jdk
COPY ./target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-Djava.stdout.flush=true","-cp","Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]