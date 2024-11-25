<%@ page import="com.cisco.dao.TrainerDAO" %>
<%@ page import="com.cisco.pojo.Trainer" %>
<%@ page import="java.sql.SQLException"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
        }
        nav {
            background-color: #007BFF;
            width: 100%;
            padding: 10px 0;
            text-align: center;
        }
        nav a {
            color: white;
            text-decoration: none;
            margin: 0 15px;
            font-weight: bold;
        }
        nav a:hover {
            text-decoration: underline;
        }
        .container {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
            margin: 20px 0;
        }
        h2 {
            color: #333;
        }
        .buttons {
            margin-top: 20px;
        }
        .buttons a {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007BFF;
            color: white;
            border-radius: 5px;
            margin: 5px;
            text-decoration: none;
        }
        .buttons a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Welcome to Zumba Portal</h2>
        <div class="buttons">
            <a href="login.jsp">Login as Trainer</a>
            <a href="sLogin.jsp">Login as Student</a>
            <a href="register.jsp">Register as Student</a>
        </div>
    </div>
</body>
</html>