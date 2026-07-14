# Microservices Composite Hands-on

## Module

**Microservices with Spring Boot 3 and Spring Cloud**

## Submodule 3: Microservices Composite Hands-on

## Objective

The objective of this hands-on is to understand the overall architecture of a microservices-based application using Spring Boot 3 and Spring Cloud. This module combines the concepts learned in the previous exercises, including service creation, service discovery, and API Gateway.

## Topics Covered

* Enterprise Applications
* Monolithic Architecture
* Microservices Architecture
* Advantages of Microservices
* Challenges of Microservices
* Spring Boot Microservices
* REST APIs
* Eureka Discovery Server
* Eureka Client Registration
* Spring Cloud API Gateway
* Global Logging Filter

## Services Included

### Account Service

* Returns account details.
* Endpoint:

```
GET /accounts/{number}
```

### Loan Service

* Returns loan details.
* Endpoint:

```
GET /loans/{number}
```

### Eureka Discovery Server

* Registers and manages all available microservices.
* Runs on:

```
http://localhost:8761
```

### Greet Service

* Returns a simple greeting.
* Endpoint:

```
GET /greet
```

### API Gateway

* Routes client requests to the appropriate microservice.
* Logs every incoming request using a Global Filter.
* Runs on:

```
http://localhost:9090
```

## Architecture

```
                 Client
                    |
                    |
             API Gateway (9090)
                    |
        -------------------------
        |                       |
        |                       |
 Account Service          Greet Service
     (8080)                  (8082)
        |
        |
 Loan Service
    (8081)

            |
            |
   Eureka Discovery Server
          (8761)
```

## Technologies Used

* Java 17
* Spring Boot 3
* Spring Cloud
* Spring Web
* Spring Cloud Gateway
* Eureka Server
* Eureka Client
* Maven

## Learning Outcomes

After completing this hands-on, I was able to:

* Develop REST-based microservices.
* Create independent Spring Boot applications.
* Register microservices with Eureka Discovery Server.
* Discover services dynamically using Eureka.
* Route requests using Spring Cloud API Gateway.
* Implement a Global Filter for request logging.
* Understand the difference between Monolithic and Microservices architecture.

## Conclusion

This composite hands-on demonstrates the basic implementation of a microservices architecture using Spring Boot 3 and Spring Cloud. It covers service development, service discovery, API Gateway routing, and request logging, providing a foundation for building scalable enterprise applications.
