FROM openjdk:1.8
WORKDIR /app/
COPY program.java ./
RUN javac program.java