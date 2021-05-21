echo **************************************************************
echo Generate JAR
echo **************************************************************
mvn clean package -DskipTests
echo **************************************************************
echo BUILD AND PUSH Docker
echo **************************************************************
docker stop app-invoice
docker rm  app-invoice
echo **************************************************************
docker  build -t ms-invoice-v1 .
docker push  ms-invoice-v1
echo **************************************************************
echo run image 
docker run -p 6002:6002 --name app-invoice --network aforo255-test -d ms-invoice-v1
echo *************************************************************
echo End Process
echo *************************************************************