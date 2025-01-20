# Foro Hub Project 
# ALURA - ORACLE NEXT EDUCATION

This README provides an overview of the ForoHub project, its purpose, and the included files.

## Project Overview

ForoHub is a Spring Boot-based web application designed as a discussion forum. It includes features for user authentication, creating, reading, updating, and deleting forum topics. The project also incorporates security measures using JWT for authentication.
 
## Key Features

*   **User Authentication**: JWT-based authentication system.
*   **Forum Topics Management**: RESTful endpoints for managing forum topics.
*   **Validation**: JSR 380 bean validation for request bodies
*   **Security**: Integration with Spring Security for authentication and authorization.
*   **Error Handling**: Custom exception handling for common errors.

## Technologies Used

*   **Spring Boot**: Framework for creating Java-based microservices.
*   **Spring Data JPA**: For database access.
*   **MySQL**: Relational database for persistence.
*   **Lombok**: For reducing boilerplate code.
*   **Java JWT**: Library for generating and verifying JWT tokens.
*   **Maven Wrapper**: For ensuring consistent Maven versions.
*   **JUnit**: For testing components

## Usage
To run this application you will need:
* Install java 21
* Install MySQL and create a database
* Setup the application.properties file in  src/main/resources
v