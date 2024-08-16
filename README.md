# Example of a Monolithic API with Java, Spring Boot, and PostgreSQL

This project is an example of a monolithic architecture developed with Java 17, using Spring Boot 3 and PostgreSQL 16.

## Technologies Used

- **Java 17**
- **Spring Boot 3**
- **PostgreSQL 16**

## Architecture

This project was developed following a monolithic architecture, which is one of the traditional approaches for application development.

In this architecture, all software components, such as authentication modules, database, business logic, and user interfaces, are integrated and run as a single application.

## Entities

The API has three main entities:

- **Company**: Represents a company in the system, containing information such as name, description, the jobs offered by the company, and the reviews related to it.
- **Job**: Represents a job position offered by a company, containing details such as title, description, minimum and maximum salary, location, and associated company.
- **Review**: Represents a review of a company by an employee or candidate, containing information such as title, description, rating, and the company to which the review is linked.

## Endpoints

The API provides the following endpoints for interacting with the entities:

- `/companies` - Endpoints to create, list, update, and delete companies.
- `/jobs` - Endpoints to create, list, update, and delete job positions.
- `/reviews` - Endpoints to create, list, update, and delete reviews.

Implemented HTTP methods include GET, POST, DELETE, and PUT for each endpoint.

Each HTTP method has an implemented endpoint that can be used by ID.

Example:

- `/companies/1`
- `/jobs/2`
- `/reviews/3`

## Notes

This project is being used as an example to study the refactoring of monolithic architecture to microservices architecture, dividing each entity into a separate service.

Below are the repositories for each service:
