FROM adoptopenjdk/openjdk8:alpine-jre

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JAVA_OPTS="" \
    TZ="America/Sao_Paulo"

RUN apk update && \
    apk add --no-cache tzdata ttf-dejavu font-adobe-100dpi && \
	cp /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone


# Adiciona o Java no PATH
ENV PATH "$PATH":/${JAVA_HOME}/bin:.:

EXPOSE 8088