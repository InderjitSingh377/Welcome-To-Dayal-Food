# Dayal Food
Dayal Food is a comprehensive system designed for managing customers, inventory, and orders. It offers secure authentication, role-based access control, and database integration using MySQL. Built with Spring Boot and Thymeleaf, the application provides a seamless experience for admin and staff members.

![Screenshot 2024-10-02 123332](https://github.com/InderjitSingh377/Welcome-To-Dayal-Food/blob/main/src/main/resources/static/Images/websiteimg.PNG)


## Features

- **Customer Management**: Easily add, update, and delete customer information.
- **Inventory Management**: Keep track of your inventory items, including stock levels and pricing.
- **Order Management**: Manage customer orders, including order creation, updates, and status tracking.
- **User Authentication**: Secure login and authentication for admin and staff members.
- **Role-Based Access Control**: Define roles and permissions for different user types.
- **Thymeleaf Templates**: Utilizes Thymeleaf for dynamic HTML templates.
- **Database Integration**: Integrated with MySQL for data storage and retrieval.

## Technology Stack

- **Backend**: Spring Boot, Java 8, Spring MVC, Spring Data JPA (Hibernate)
- **Frontend**: Thymeleaf, HTML, CSS, JavaScript
- **Database**: MySQL
- **IDE**: Eclipse, Spring Tool Suite (STS)

## Prerequisites

Before running this project, ensure you have the following installed:

- Java 8
- MySQL
- Maven
- Eclipse or Spring Tool Suite (STS)

## Setup and Installation
# 🎁 Donate

<a href="https://buymeacoffee.com/1122anuragg">
  <img src="https://user-images.githubusercontent.com/25067102/154570688-9e143f2b-fee3-4b05-a9d2-a7a3013b2b51.png" />
<a/>
1. Clone the repository:
    ```bash
    git clone https://github.com/your-repository-url/FoodFrenzy.git
    ```

2. Navigate to the project directory:
    ```bash
    cd FoodFrenzy
    ```

3. Configure MySQL Database:
    - Create a new MySQL database.
    - Update `application.properties` with your MySQL credentials:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/foodfrenzy
      spring.datasource.username=root
      spring.datasource.password=root
      spring.jpa.hibernate.ddl-auto=update
      ```

4. Run the project:
    ```bash
    mvn spring-boot:run
    ```

5. Access the application:
    - Navigate to `http://localhost:8080` in your browser. 
## Website Screenshot


## Project Structure

```bash
src/
├── main/
│   ├── java/
│   │   └── com.example.foodfrenzy/
│   │       ├── controller/      # Contains all controllers
│   │       ├── model/           # Contains entity classes
│   │       ├── repository/      # Repository interfaces for database interaction
│   │       └── service/         # Service layer with business logic
│   ├── resources/
│   │   ├── templates/           # Thymeleaf templates for views
│   │   ├── static/              # Static assets (CSS, JavaScript)
│   │   └── application.properties  # Project configuration
│   └── webapp/
│       └── WEB-INF/
│           └── views/           # Additional view files
└── test/                        # Test cases for unit testing
