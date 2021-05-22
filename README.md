# InvoiceMicroService

#Sistema de pago de facturas realizado en una arquitectura de microservicios con contenedores en docker. 
#Utilizando apache Kafka para la comunicacion entre microservicios

#Ejecutar los siguientes comandos en un powershell

#Creamos la red en docker
docker network create aforo255-test

#INSTALAMOS LAS IMAGENES 
** KAFKA
docker run -p 2181:2181 -d -p 9092:9092 --name servicekafka-test --network aforo255-test -e ADVERTISED_HOST=127.0.0.1  -e NUM_PARTITIONS=3 johnnypark/kafka-zookeeper
** MYSQL
docker run -p 3307:3306  --name microservicio-mysql8-test --network aforo255-test -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=db_invoice -d mysql:8​
** POSTGRESQL
docker run -p 5432:5432  --name microservicio-postgres12-test --network aforo255-test -e POSTGRES_PASSWORD=123456 -e  POSTGRES_DB=db_invoice -d postgres:12-alpine
**MONGO DB
docker run -p 27018:27017  --name mongodb-test --network aforo255-test -d mongo​
