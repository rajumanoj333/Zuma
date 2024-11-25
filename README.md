The step-by-step process:

1. **Create a Maven Project**: Create a new Maven project in Spring Tool Suite (STS).
2. **Add Dependencies**: Add necessary dependencies to the `pom.xml` file, including Spring Web, Spring JDBC, MySQL Connector, and JSTL.
3. **Create DAO**: Create a Data Access Object (DAO) file `UserDAO.java` to interact with the database.
4. **Create Controller**: Create a controller file `UserController.java` to handle HTTP requests and responses.
5. **Create DBUtil**: Create a utility file `DBUtil.java` to configure the database connection.
6. **Create POJO**: Create a Plain Old Java Object (POJO) file `User.java` to represent the database table.
7. **Create JSP**: Create a JSP files `users.jsp` to display the data.
8. **Configure Spring MVC**: Configure the Spring MVC framework by creating an application context file `applicationContext.xml`.
9. **Run the Application**: Run the application using the `mvn spring-boot:run` command or by clicking the "Run" button in STS.

This process sets up a basic Spring MVC application with a MySQL database, allowing you to perform CRUD (Create, Read, Update, Delete) operations on a `users` table.

![Untitled diagram-2024-11-21-071529 (1)](https://github.com/user-attachments/assets/4637a1c0-be2b-4dc4-9283-84189106cad5)
