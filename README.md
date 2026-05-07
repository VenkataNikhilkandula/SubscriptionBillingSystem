# Subscription Billing System

A Spring Boot backend application for managing subscription plans, users, subscriptions, billing, and payments.

---

## 🚀 Technologies Used

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- JWT Authentication
- Swagger/OpenAPI
- Maven
- Lombok

---

## 📂 Project Structure

```text
com.stackly
│
├── config
├── controller
├── service
├── service.impl
├── repository
├── entity
├── dto
├── exception
├── util
--------------------------------

✨Features

User Management
Role-Based Authentication
Plan Management
Subscription Management
Billing & Payments
Dashboard APIs
JWT Security
Global Exception Handling
Swagger API Documentation
-------------------------------------
⚙️ Setup Instructions

1. Clone Repository

</> Bash

git clone https://github.com/your-username/subscription-billing-system.git
------------------------------------------
2. Configure MySQL

Create database:

</>SQL

CREATE DATABASE subscription_db;
-------------------------------------------------

3. Configure application.properties

</> Properities

spring.datasource.url=jdbc:mysql://localhost:3306/subscription_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
------------------------------------------------
4. Run Project

mvn clean install
mvn spring-boot:run
---------------------------------------------
📦 Main APIs
Users
POST /api/users
GET /api/users

Plans
POST /api/plans
GET /api/plans

Subscriptions
POST /api/subscriptions
GET /api/subscriptions

Billing
POST /api/billing/pay
GET /api/billing/history
