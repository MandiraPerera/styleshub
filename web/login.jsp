<%@page import="app.classes.Category"%>
<%@page import="app.classes.Product"%>
<%@page import="app.classes.User"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login | Style Hub</title>
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
            .login-form {
                width: 100%;
                max-width: 500px;
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
            <div class="login-form">
                <%
                    String successMessage = (String) session.getAttribute("successMessage");
                    if (successMessage != null) {
                %>
                <div class="alert alert-success" role="alert">
                    <%= successMessage %>
                </div>
                <%
                        session.removeAttribute("successMessage");
                    }
                %>
                <%
                    String errorMessage = (String) session.getAttribute("errorMessage");
                    if (errorMessage != null) {
                %>
                <div class="alert alert-danger" role="alert">
                    <%= errorMessage %>
                </div>
                <%
                        session.removeAttribute("errorMessage");
                    }
                %>
                <form action="LoginServlet" method="post">
                    <h3 class="text-center mb-4">Please Enter Your Details to Login</h3>
                    <!-- Email input -->
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form2Example1">Email address</label>
                        <input name="email" type="email" id="form2Example1" class="form-control" required />
                    </div>
                    <!-- Password input -->
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form2Example2">Password</label>
                        <input name="password" type="password" id="form2Example2" class="form-control" required />
                    </div>
                    <!-- Submit button -->
                    <button type="submit" class="btn btn-primary btn-block w-100 mb-4">Log in</button>
                    <!-- Register link -->
                    <div class="text-center">
                        <p>Not a member? <a href="register.jsp">Register</a></p>
                    </div>
                </form>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
    </body>
</html>