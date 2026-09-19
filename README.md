# Basic User Management System

🇬🇧 English | [🇹🇷 Türkçe](README.tr.md)

A basic user management web application built with **Spring Boot**, **Spring MVC**, **Spring Data JPA**, **Thymeleaf** and **MySQL**. I built it to learn CRUD operations and layered architecture in Java backend development.



https://github.com/user-attachments/assets/6c178098-df60-480c-9bec-4d9f0ad7aeb0



## Features

- Add new users (first name, last name, email)
- List all users
- Update existing users
- Delete users

## Tech Stack

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf (server-side HTML templates)
- MySQL
- Maven

## Architecture

The project follows a layered structure:

- **Model:** the `User` entity
- **Service:** business logic (`UserService`)
- **Controller:** handles web requests and returns Thymeleaf views

## Getting Started

### Prerequisites

- JDK 17 or newer
- MySQL
- Git

### Database setup

The app connects to a local MySQL server. The `user_db` database is created automatically on the first run, so you don't need to create it yourself.

Provide your MySQL credentials as environment variables so they never end up in the repository:

```
SPRING_DATASOURCE_USERNAME=your_username
SPRING_DATASOURCE_PASSWORD=your_password
```

The rest of the connection settings are in `src/main/resources/application.properties`.

### Run locally

```bash
git clone https://github.com/0xSametCindilli/Basic-User-Management-System.git
cd Basic-User-Management-System
./mvnw spring-boot:run
```

On Windows use `mvnw.cmd spring-boot:run` instead.

Then open [http://localhost:8080](http://localhost:8080) in your browser.

## Usage

1. Start the application and open [http://localhost:8080](http://localhost:8080).
2. Go to the add user page.
3. Enter the first name, last name and email, then save.
4. The new user appears in the user list.
5. Edit or delete users from the list.

## Project Structure

```
src/main/java/com/abdul_samet_cindilli/UserManagement   # Controller, service, model
src/main/resources/templates                            # Thymeleaf templates
src/main/resources/application.properties               # App and database configuration
```

## Roadmap

- [ ] Input validation
- [ ] Search and pagination
- [ ] Unit and integration tests

## License

This project is for learning purposes.
