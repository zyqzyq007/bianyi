FROM openjdk:12
WORKDIR /app/
COPY program.java ./
RUN javac program.java
