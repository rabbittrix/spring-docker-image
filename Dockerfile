FROM openjdk:11
ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /apt/spring-docker-image

COPY /target/spring-docker-image*.jar spring-docker-image.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 5005
EXPOSE 8080

CMD java ${ADDITIONAL_OPTS} -jar spring-docker-image.jar --spring.profile.active=${PROFILE}


