# 🚗 Vehicle Rental System

A Java-based web application for managing vehicle rentals, developed using **Java Servlets, JSP, JDBC, and MySQL**. The application follows the **Model-View-Controller (MVC)** architecture, providing a clean separation between the presentation, business logic, and data access layers.

## ✨ Features

* User registration and login authentication
* Secure session-based login/logout
* View available vehicles
* Search vehicles by criteria
* Book vehicles
* Add new vehicles
* Update vehicle information
* Delete vehicles
* MySQL database integration using JDBC

## 🛠️ Tech Stack

* **Backend:** Java, Servlets, JDBC
* **Frontend:** JSP, HTML, CSS
* **Database:** MySQL
* **Server:** Apache Tomcat
* **Architecture:** MVC (Model-View-Controller)

## 📁 Project Structure

```text
VehicleRentalSystem/
│── src/
│   └── main/
│       ├── java/
│       │   └── com/vehicle/
│       │       ├── controller/
│       │       ├── dao/
│       │       ├── model/
│       │       └── util/
│       └── webapp/
│           ├── css/
│           ├── views/
│           └── WEB-INF/
│── build/
└── README.md
```

## 🏗️ MVC Architecture

* **Model:** Represents application entities (`User`, `Vehicle`, `Booking`).
* **View:** JSP pages that provide the user interface.
* **Controller:** Java Servlets that handle requests and responses.
* **DAO:** Performs database operations using JDBC.
* **Utility:** Manages the database connection.

## ⚙️ Prerequisites

Before running the project, make sure you have:

* Java JDK 8 or later
* Apache Tomcat 9.x or later
* MySQL Server
* MySQL Connector/J
* Eclipse IDE or Visual Studio Code (optional)

## 🚀 Getting Started

1. Clone the repository.
2. Import the project into your IDE.
3. Create the required MySQL database and tables.
4. Update the database credentials in `DBConnection.java`.
5. Add the MySQL Connector JAR to the project if needed.
6. Deploy the project to Apache Tomcat.
7. Open the application in your browser.

## 📌 Modules

* User Authentication
* Vehicle Management
* Vehicle Search
* Vehicle Booking
* Dashboard
* Session Management

## 📚 Concepts Demonstrated

* Java Web Development
* Servlets and JSP
* JDBC Database Connectivity
* CRUD Operations
* MVC Design Pattern
* Session Management
* Object-Oriented Programming

## 🔮 Future Enhancements

* Role-based access control (Admin/User)
* Online payment gateway integration
* Vehicle image upload
* Booking history
* Email notifications
* Responsive UI using Bootstrap
* REST API integration

## 👨‍💻 Author

Developed as a Java Web Application project to demonstrate MVC architecture, database connectivity, and CRUD operations using Java EE technologies.

---

⭐ If you found this project useful, consider giving it a star on GitHub!
