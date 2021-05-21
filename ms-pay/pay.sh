echo **************************************************************
echo Generate JAR
echo **************************************************************
mvn clean package -DskipTests
echo **************************************************************
echo BUILD AND PUSH Docker
echo **************************************************************
docker stop app-pay
docker rm  app-pay
echo **************************************************************
docker  build -t ms-pay-v1 .
docker push  ms-pay-v1
echo **************************************************************
echo run image 
docker run -p 6001:6001 --name app-pay --network aforo255-test -d ms-pay-v1
echo *************************************************************
echo End Process
echo *************************************************************