Subscription Billing System

Enterprise-level Subscription Billing System built using Java Spring Boot following layered architecture and industry best practices.

🚀 Project Overview

This project is a complete backend system for managing:

User Management
Role-Based Access Control (RBAC)
Subscription Plans
Subscription Management
Billing & Payments
Dashboard APIs
Audit Logging
JWT Authentication
Search, Filtering & Pagination

The application is designed using enterprise-level architecture with scalability and maintainability in mind.
----------------------------------------------------

🏗️ Tech Stack
Technology	Version
Java	17
Spring Boot	3.3.2
Spring Security	Latest
Spring Data JPA	Latest
MySQL	8+
Maven	Latest
JWT	0.11.5
Swagger/OpenAPI	2.5.0
Lombok	Latest
📂 Project Architecture
com.stackly
│
├── config
│   ├── SecurityConfig.java
│   ├── SwaggerConfig.java
│   ├── AuditConfig.java
│
├── controller
│   ├── AuthController.java
│   ├── UserController.java
│   ├── PlanController.java
│   ├── SubscriptionController.java
│   ├── BillingController.java
│   ├── DashboardController.java
│
├── service
│   ├── AuthService.java
│   ├── UserService.java
│   ├── PlanService.java
│   ├── SubscriptionService.java
│   ├── BillingService.java
│   ├── DashboardService.java
│
├── service.impl
│   ├── AuthServiceImpl.java
│   ├── UserServiceImpl.java
│   ├── PlanServiceImpl.java
│   ├── SubscriptionServiceImpl.java
│   ├── BillingServiceImpl.java
│   ├── DashboardServiceImpl.java
│
├── repository
│   ├── UserRepository.java
│   ├── RoleRepository.java
│   ├── PlanRepository.java
│   ├── SubscriptionRepository.java
│   ├── PaymentRepository.java
│   ├── AuditLogRepository.java
│
├── entity
│   ├── User.java
│   ├── Role.java
│   ├── Plan.java
│   ├── Subscription.java
│   ├── Payment.java
│   ├── AuditLog.java
│
├── dto
│   ├── request
│   ├── response
│
├── exception
│   ├── GlobalExceptionHandler.java
│   ├── ResourceNotFoundException.java
│
├── util
│   ├── JwtUtil.java
│
└── SubscriptionBillingSystemApplication.java
------------------
✨ Features
👤 User Management
Create User
Get Users
Update User
Delete User
----------------------------
🔐 Authentication & Authorization
JWT Authentication
Role-Based Access Control
Secure APIs
------------------------------
📦 Subscription Plan Management
Create Plan
Update Plan
Delete Plan
Search Plans
Pagination Support
-------------------------------
🔁 Subscription Management
Subscribe User to Plan
Cancel Subscription
Track Subscription Status
---------------------------
💳 Billing & Payments
Payment Processing
Payment History
Revenue Calculation
----------------------------
📊 Dashboard APIs
Total Users
Active Subscriptions
Revenue Reports
-------------------------------
🧾 Audit Logging
Track CRUD Operations
Maintain Action History
-------------------------------
⚙️ Setup Instructions
1️⃣ Clone Repository
git clone https://github.com/your-username/subscription-billing-system.git
--------------------------------------------
2️⃣ Open Project
Open in:
Eclipse
Spring Tool Suite (STS)
----------------------------------------
3️⃣ Configure Database

Create MySQL database:

CREATE DATABASE subscription_db;
4️⃣ Configure application.properties
server.port=8080

spring.datasource.url=jdbc:mysql://localhost:3306/subscription_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true
--------------------------------------------------
5️⃣ Install Dependencies
mvn clean install
-------------------------------------------------
6️⃣ Run Application
mvn spring-boot:run
----------------------------------------------------
🌐 Swagger Documentation

Access Swagger UI:

http://localhost:8080/swagger-ui/index.html
-----------------------------------------------------------
📦 API Endpoints
👤 Users
Method	Endpoint	Description
POST	/api/users	Create User
GET	/api/users	Get All Users
---------------------------------------------------------
📦 Plans
Method	Endpoint	Description
POST	/api/plans	Create Plan
GET	/api/plans	Get All Plans
--------------------------------------------------------
🔁 Subscriptions
Method	Endpoint	Description
POST	/api/subscriptions	Create Subscription
GET	/api/subscriptions	Get All Subscriptions
PUT	/api/subscriptions/{id}/cancel	Cancel Subscription
--------------------------------------------------------
💳 Billing
Method	Endpoint	Description
POST	/api/billing/pay	Process Payment
GET	/api/billing/history	Payment History
-------------------------------------------------------
📊 Dashboard
Method	Endpoint	Description
GET	/api/dashboard/summary	Dashboard Summary
----------------------------------------------
🗄️ Database Tables
users
roles
plans
subscriptions
payments
audit_logs
------------------------------------------------
🧪 Testing
Use:

Postman
Swagger UI
--------------------------------------------
🔒 Security
JWT Token Authentication
Password Protection
Role-Based Authorization
Secure REST APIs
-------------------------------------------------
