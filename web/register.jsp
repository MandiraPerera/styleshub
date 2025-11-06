<%@page import="app.classes.Category"%>
<%@page import="app.classes.Product"%>
<%@page import="java.util.List"%>
<%@page import="app.classes.User"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>User Registration | Style Hub</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <style>
            html, body {
                height: 100%;
            }
            .centered-form-container {
                display: flex;
                justify-content: center;
                align-items: center;
                min-height: calc(100vh - 56px);
            }
            .registration-form {
                width: 100%;
                max-width: 600px;
                padding: 20px;
                margin: auto;
                background-color: #f8f9fa;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0,0,0,0.1);
            }
        </style>
    </head>
    <body>
        <%@include file="components/nav_bar.jsp" %>

        <div class="centered-form-container">
            <div class="registration-form">
                <%
                    String errorMessage = (String) session.getAttribute("errorMessage");
                    if (errorMessage != null) {
                %>
                <div class="alert alert-danger" role="alert">
                    <%= errorMessage%>
                </div>
                <%
                        session.removeAttribute("errorMessage");
                    }

                    String successMessage = (String) session.getAttribute("successMessage");
                    if (successMessage != null) {
                %>
                <div class="alert alert-success" role="alert">
                    <%= successMessage%>
                </div>
                <%
                        session.removeAttribute("successMessage");
                    }
                %>

                <h3 class="text-center mb-4">Please Enter Your Details to Sign Up</h3>

                <form action="RegisterServlet" method="post">
                    <div class="mb-3">
                        <label for="name" class="form-label">User Name</label>
                        <input name="user_name" type="text" class="form-control" id="name" placeholder="Enter user name" required>
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">User Email</label>
                        <input name="user_mail" type="email" class="form-control" id="email" placeholder="Enter Email" required>
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">User Password</label>
                        <input name="user_password" type="password" class="form-control" id="password" placeholder="Enter your password" required>
                    </div>
                    <div class="mb-3">
                        <label for="phoneno" class="form-label">User Phone Number</label>
                        <input name="user_phone" type="tel" class="form-control" id="phoneno" placeholder="Enter phone number" required>
                    </div>
                    <div class="mb-3">
                        <label for="address" class="form-label">User Address</label>
                        <textarea name="user_address" class="form-control" id="address" placeholder="Enter your address" rows="3" required></textarea>
                    </div>

                    <div class="d-grid gap-2">
                        <button type="submit" class="btn btn-primary">Register</button>
                        <button type="reset" class="btn btn-secondary">Reset</button>
                    </div>
                </form>

                <div class="text-center mt-3">
                    <p>Already a member? <a href="login.jsp">Login</a></p>
                </div>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
    </body>
</html>