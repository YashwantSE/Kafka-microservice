# Kafka-microservice

**** to run  zookeeper   *****
PS C:\kafka_server\bin\windows> .\zookeeper-server-start.bat ..\..\config\zookeeper.properties

**** to run kafka server 
.\kafka-server-start.bat ..\..\config\server.properties

****  to find current topics
.\kafka-topics.bat --list --bootstrap-server localhost:9092

**** to create topic ****
.\kafka-topics.bat --create --topic reply-topic --bootstrap-server localhost:9092

*****
