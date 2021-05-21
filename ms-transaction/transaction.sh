echo **************************************************************
echo Generate JAR
echo **************************************************************
mvn clean package -DskipTests
echo **************************************************************
echo BUILD AND PUSH Docker
echo **************************************************************
docker stop app-transaction
docker rm  app-transaction
echo **************************************************************
docker  build -t ms-transaction-v1 .
docker push  ms-transaction-v1
echo **************************************************************
echo run image 
docker run -p 6003:6003 --name app-transaction --network aforo255-test -d ms-transaction-v1
echo *************************************************************
echo End Process
echo *************************************************************