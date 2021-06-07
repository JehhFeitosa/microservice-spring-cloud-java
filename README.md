# microservice-spring-cloud-java
- Diretório destinado ao Projeto "Ecossistema de E-commerce" 

##Desenvolvido com à Arquitetura de Microsserviços.

- Utilizei o conceito de Health Check, 
- Configuração de Spring Data, 
- Config Server,
- Service Discovery
- Modelagem e Persistência de Dados com Spring Data Elastic Search,
- API REST,
- API Gateway.  

###Para Startar a Micro)
- digitar no browser http://localhost:8082/actuator/health

(Retornado "UP")

- seguir com inclusão
http POST http://localhost:8082/cart/123 productId=1 amount=1

- Para buscar dados
http GET http://localhost:8082/cart/123 

