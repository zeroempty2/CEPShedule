FROM alpine:latest

# 필요한 패키지 설치
RUN apk add --no-cache wget unzip curl gnupg chromium chromium-chromedriver

# ChromeDriver 설치
RUN ln -s /usr/bin/chromium-browser /usr/bin/google-chrome && \
    ln -s /usr/bin/chromedriver /usr/local/bin/chromedriver
    
FROM openjdk:17-jdk-alpine
# 빌드
WORKDIR /app

# 빌드 단계에서 생성된 JAR 파일 복사
COPY build/libs/*.jar app.jar

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "app.jar"]
