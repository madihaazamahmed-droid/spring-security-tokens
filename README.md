# Spring Security Authentication & Authorization

A Spring Boot application demonstrating **Spring Security** with **Basic Authentication** and **Role-Based Authorization**. The project secures REST APIs by restricting access based on user roles.

## 🚀 Features

- Spring Boot REST API
- Spring Security Integration
- Basic Authentication
- Role-Based Authorization
- In-Memory User Authentication
- Secure REST Endpoints
- Maven Project

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring Security
- Maven

## 📁 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.example
│   │       ├── controller
│   │       ├── security
│   │       └── SpringSecurityApplication.java
│   └── resources
│       └── application.properties
```

## 🔐 Authentication

### Admin

```
Username: admin
Password: admin123
```

### User

```
Username: user
Password: user123
```

## 📌 Authorization

| HTTP Method | Endpoint | Access |
|-------------|----------|--------|
| GET | `/api/**` | USER, ADMIN |
| POST | `/api/**` | ADMIN |
| PUT | `/api/**` | ADMIN |
| DELETE | `/api/**` | ADMIN |

## ▶️ How to Run

### Prerequisites

- Java 21
- Maven
- Eclipse IDE / IntelliJ IDEA

### Steps

1. Clone the repository

```bash
git clone https://github.com/madihaazamahmed-droid/spring-authorization.git
```

2. Open the project in your IDE.

3. Run the Spring Boot application.

4. Test the secured APIs using Postman.

## 📚 Learning Outcomes

- Spring Security Fundamentals
- Authentication
- Authorization
- Role-Based Access Control (RBAC)
- Security Configuration
- Basic Authentication
- REST API Security

## 👩‍💻 Author

**Madiha Azam Ahmed**

GitHub: https://github.com/madihaazamahmed-droid
