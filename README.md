# DirectDeal
DirectDeal is een online direct handelssysteem voor iedereen. Daarin kan iedereen vrij niet allen zijn spullen verhandelen maar ook producten kopen die anderen verkopen.  

# Het Doel
DirectDeal is mijn vrijetijdsproject die onder gedecentraliseerde omgeving, vooral MSA (Micro Service Architecture), naar ontwerp en implementatie van enterprise java omgeving streeft. In die project gebruikte ik populaire of veelbelovende technologieën, ontwerp patronen, en gereedschappen. Zoals onder meer Spring Boot, Spring Webflux, Event Sourcing(Axon Framework), CQRS patron, Kafka, Redis, No Sql(Mongo DB), REST-API, Docker, Kubernetes, Java 11, JPA(Hibernate), en Gradle.  
De reden waarom ik die project begon is om het gebrek aan ervaring onder gedecentraliseerde omgeving te compenseren. Eindelijk door die project heb ik een enterprise java omgeving implementeren onder MSA omgeving. Daarom geloof ik in dat ik bereid ben om in een project te werken onder gedecentraliseerde omgeving.  

# Ontwikkel-Omgeving
* Operating System: Linux (Debian/Ubuntu), Windows (WSL)
* JAVA: 12 
* Mysql: 5.7 
* Mongo DB : 4.0.25 
* Kafka: wurstmeister/kafka:2.12-2.4.0 
* Redis: 6.2.4 
* Spring boot: 2.5.0 
* Spring webflux: 5.3.7 
* Spring cloud gateway: 3.0.4 
* Spring cloud kubernetes: 2.0.4 
* Gradle: 7.4 
* Axon framework: 4.5 
* Kubernetes/minikube : v1.30.1 
* Hibernate : 5.4.31 
* Vue.js:2.6.14 
* Vuetify:2.5.4
* Mockito:
* 

# Het Verloop van Uitvoering
## 1. De Github-Opslagplaats van DirectDeal Project Klonen
```
$> git clone https://github.com/nieuwmijnleven/directdeal.git
$> cd ./directdeal
```
## 2. Minikube Installeren
[How to Install Minikube on Ubuntu](https://phoenixnap.com/kb/install-minikube-on-ubuntu#:~:text=Step%201%3A%20Update%20System%20and%20Install%20Required%20Packages%0ABefore,apt-get%20install%20curl%0Asudo%20apt-get%20install%20apt-transport-https%0AIn%20the%20)

## 3. Alle MSA Services Opbouwen en Starten
```
$> ./start-direct-deal-service.sh
```
## 4. DirectDeal Website Koppelen
[http://localhost:8084](http://localhost:8084)

# SysteemArchitectuur
## 1. De structuur van het geheel systeem
Het gehele systeem bestaat uit 6 Micro-Services: direct-deal-account-service, direct-deal-chatting-service, direct-deal-gateway-service, direct-deal-sale-service, en direct-deal-sale-catalog-service. Elke Micro-Service speelt een rol in dit systeem. direct-deal-account-service is bijvoorbeeld verantwoordelijk voor het management van gebruikersaccount en in/outloggen en direct-deal-sale-service geeft functionaliteiten van het registreren, wijzigen, en verwijderen van producten aan gebruikers. opvallend is dat voor direct-deal-sale-service en direct-deal-sale-catalog-service Event-Sourcing en CQRS(Command Query Responsibility Segregation) Patron gelden. Daardoor, aan kan de kant van het lezen (direct-deal-sale-catalog-service) wordt lock contention verminderd en hoeft transactie niet gebruikt te worden. Dus, die systeem kan gebruikers voorzien van sneller reactiesnelheid van lezen. 

Event-Sourcing is ~, en CQRS Patron ~. 


## 2. MicroServices
### 1. direct-deal-account-service
* direct-deal-account-service is verantwoordelijk voor het management van gebruikersaccount en in/outloggen
* die microservice creërt een JWT(JSON Web Token) en stuurt het een gebruiker wanneer de gebruiker in de directdeal systeem logt.
* door JWT in de authorization veld van httpaanvraagheader te injecteren, kunnen gebruikers alle microservices gebruiken. 
  
### 2. direct-deal-chatting-service
* die microservice verstrekt functionaliteit van chatting tussen verkoper en koper 

### 3. direct-deal-gateway-service


### 4. direct-deal-sale-service
* die microservice geeft functionaliteiten van het registreren, wijzigen, en verwijderen van producten aan gebruikers
* Event-sourcing en CQRS(Command Query Responsibility Segregation) patron gelden voor die microservice
* die microservice implementeert de `Command` deel van CQRS Patron
* die microservice organiseert de `EventStore` in Event-Sourcing

### 5. direct-deal-account-service
* die microservice geeft lijst van verkrijgbare producten aan gebruikers
* Event-sourcing en CQRS(Command Query Responsibility Segregation) patron gelden voor die microservice
* die microservice implementeert de `Query` deel van CQRS Patron
* die microservice organiseert de `` in Event-Sourcing 

## 6. direct-deal-transaction-history-service
* die microservice geeft list van voltooide transacties aan gebruikers


### EventSourcing + CQRS
### JWT (JSON WEB TOKEN)

# Micro-Services
## 1. direct-deal-account-service
### JWT (JSON Web Token)
## 2. direct-deal-chatting-service
## 3. direct-deal-gateway-service
### Spring Cloud Gateway (Spring Webflux)
## 4. direct-deal-sale-service
### Eventsourcing + CQRS
### EventStore MYSQL
## 5. direct-deal-sale-catalog-service
### Eventsourcing + CQRS
### REDIS
### MONGO DB
## 6. direct-deal-transaction-history-service

# To be provided (scheduled)


# Example


# Authors

* **Jeon, Cheol** 

## License

