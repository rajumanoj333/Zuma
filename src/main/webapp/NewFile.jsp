<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.cisco.dao.TrainerDAO" %> <html>
<head>
    <title>Student Login</title>
</head>
<body>
    <h2> Login</h2>
    <form action="NewFile.jsp" method="post">
        <label for="tEmail">Email:</label>
        <input type="email" name="tEmail" required><br><br> 

    <label for="tPassword">Password:</label>
    <input type="password" name="tPassword" required><br><br>

    <input type="submit" value="Login">
</form>

<%
    if (request.getMethod().equalsIgnoreCase("POST")) {
        String tEmail = request.getParameter("tEmail");
        String tPassword = request.getParameter("tPassword");

        TrainerDAO trainerDAO = new TrainerDAO();
        boolean isValidUser = trainerDAO.validateLogin(tEmail, tPassword);

        if (isValidUser) {
            out.println("<a href='ViewTrainers.jsp'>View Trainers</a>");
            out.println("<a href='register.jsp'>Add Trainers</a>");
           
        } else {
            out.println("<p>Invalid email or password!</p>");
        }
    }
%> 

 </body>
</html>