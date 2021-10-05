FROM openjdk:14
WORKDIR /app/
COPY program.java ./
RUN javac program.java
