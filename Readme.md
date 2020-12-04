git checkout -b main

mvn clean install
./mvnw clean package -DskipTests

docker build -t spring-app .
docker run -p 8080:8080 spring-docker-image
docker build -f Dockerfile -t spring-docker-image .

docker-compose up --build --force-recreate

curl http://localhost:8080/ping


