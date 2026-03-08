🌐 Online Library Management System (Web Application) A Java Web Application for managing library operations using Servlets, JSP, JDBC, and MySQL. The system supports Admin and User (Student) roles and runs on Apache Tomcat.

🚀 Features 👨‍💼 Admin Module Admin login

Add new books

View all books

Manage book availability

Logout

👨‍🎓 User (Student) Module User login

View available books

Issue books (logic-based)

Logout

🛠️ Technologies Used Java (JDK 23)

Servlet & JSP

JDBC

MySQL

Apache Tomcat 9

HTML / CSS

IntelliJ IDEA / VS Code

MySQL Workbench

🗄️ Database Design Database Name sql Copy code olms Books Table sql Copy code CREATE TABLE books ( id INT PRIMARY KEY AUTO_INCREMENT, title VARCHAR(150), author VARCHAR(100), available TINYINT(1) ); Users Table sql Copy code CREATE TABLE users ( id INT PRIMARY KEY AUTO_INCREMENT, username VARCHAR(50), password VARCHAR(50), role VARCHAR(20) ); 🔄 Application Workflow User logs in as Admin or Student

Role-based redirection is performed

Admin manages books and availability

Users can view and issue available books

Logout ends the session

🔌 Database Configuration Update database credentials in DBConnection.java:

java Copy code String url = "jdbc:mysql://localhost:3306/olms"; String user = "root"; String password = "your_mysql_password"; ▶️ How to Run the Application Install MySQL and Apache Tomcat 9

Create database olms

Create required tables

Add MySQL Connector/J to the project

Configure Tomcat Server in your IDE

Deploy the project on Tomcat

Open browser and visit:

arduino Copy code http://localhost:8080/OLMS/ 🧠 Core Concepts Used MVC Architecture

DAO Pattern

Servlet Lifecycle

JSP for View Layer

JDBC with PreparedStatement

🔮 Future Enhancements Password encryption

Role-based access control

Book return & fine calculation

Pagination and search

REST API integration
👤 Author Kishan Pandey
