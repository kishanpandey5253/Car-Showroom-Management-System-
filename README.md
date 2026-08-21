# 🚗 Car Showroom Management System

A **Java-based Car Showroom Management System** designed to manage showroom operations such as adding cars, viewing available cars, managing car availability, and handling customer-related operations.

The system provides separate **Admin and User (Customer)** roles and is designed using Java, JDBC, MySQL, and a web-based interface.

## 🚀 Features

### 👨‍💼 Admin Module

* Admin login
* Add new cars
* View all cars
* Manage car availability
* Update car details
* Delete cars
* Manage showroom inventory
* Logout

### 👤 User (Customer) Module

* User login
* View available cars
* View car details
* Search for cars
* Check car availability
* Book/Enquire about available cars
* Logout

## 🛠️ Technologies Used

* **Java**
* **Servlet & JSP**
* **JDBC**
* **MySQL**
* **Apache Tomcat**
* **HTML / CSS**
* **IntelliJ IDEA / VS Code**
* **MySQL Workbench**

## 🗄️ Database Design

### Database Name

```sql
car_showroom
```

### Cars Table

```sql
CREATE TABLE cars (
    id INT PRIMARY KEY AUTO_INCREMENT,
    brand VARCHAR(100),
    model VARCHAR(100),
    price DECIMAL(12,2),
    fuel_type VARCHAR(50),
    transmission VARCHAR(50),
    year INT,
    available TINYINT(1)
);
```

### Users Table

```sql
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(100),
    role VARCHAR(20)
);
```

## 🔄 Application Workflow

1. User logs in as **Admin** or **Customer**.
2. The system performs **role-based redirection**.
3. Admin can manage cars and showroom inventory.
4. Customers can view available cars and their details.
5. Customers can check availability or submit a booking/enquiry.
6. Logout terminates the active session.

## 🔌 Database Configuration

Update the database credentials in `DBConnection.java`:

```java
String url = "jdbc:mysql://localhost:3306/car_showroom";
String user = "root";
String password = "your_mysql_password";
```

Make sure the **MySQL Connector/J** driver is added to the project.

## ▶️ How to Run the Application

### 1. Install Required Software

Install:

* Java JDK
* MySQL
* Apache Tomcat
* MySQL Workbench
* IntelliJ IDEA or VS Code

### 2. Create the Database

Open MySQL Workbench and create the database:

```sql
CREATE DATABASE car_showroom;
```

### 3. Create Required Tables

Execute the provided SQL commands for the `cars` and `users` tables.

### 4. Configure Database

Update the MySQL username and password in `DBConnection.java`.

### 5. Add MySQL Connector/J

Add the MySQL JDBC driver to the project libraries.

### 6. Configure Apache Tomcat

Configure **Apache Tomcat** in your IDE and deploy the project.

### 7. Run the Application

Open your browser and visit:

```text
http://localhost:8080/CarShowroom/
```

## 🧠 Core Concepts Used

* **MVC Architecture**
* **DAO Pattern**
* **Servlet Lifecycle**
* **JSP for View Layer**
* **JDBC**
* **PreparedStatement**
* **Session Management**
* **Role-Based Authentication**
* **CRUD Operations**

## 📁 Main Modules

```text
Car Showroom Management System
│
├── Admin
│   ├── Login
│   ├── Add Car
│   ├── View Cars
│   ├── Update Car
│   ├── Delete Car
│   └── Manage Availability
│
├── Customer
│   ├── Login
│   ├── View Cars
│   ├── Search Cars
│   ├── Check Availability
│   └── Booking / Enquiry
│
├── Database
│   ├── Cars
│   └── Users
│
└── Authentication
    ├── Admin
    └── Customer
```

## 🔮 Future Enhancements

* Password encryption using BCrypt
* Advanced role-based access control
* Car booking and cancellation
* Test-drive scheduling
* Customer management
* Sales and billing module
* EMI and finance calculation
* Advanced car search and filtering
* Pagination
* Car image upload
* Online payment integration
* Email/SMS notifications
* REST API integration
* Sales reports and analytics


REST API integration
👤 Author Kishan Pandey
