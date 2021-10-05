FROM openjdk:1.8.0_291
WORKDIR /app/
COPY program.java ./
RUN javac program.java
