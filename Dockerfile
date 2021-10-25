FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine

COPY ./build/libs/worldcount-1.0-SNAPSHOT-all.jar app.jar
ADD ./docker-entrypoint.sh docker-entrypoint.sh

EXPOSE 8080

ENTRYPOINT ["sh", "/docker-entrypoint.sh"]