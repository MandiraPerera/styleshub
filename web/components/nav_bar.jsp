<%@page import="app.classes.Category"%>
<%@page import="app.classes.Product"%>
<%@page import="app.classes.User"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>StyleHub</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/css/bootstrap.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
        
        <script src="script.js"></script>
        <style>
            .navbar {
                background-color: #808080;
                border-radius: 15px;
                width: 97%;
                margin: 0 auto 2rem;
                padding: 1rem;
                font-family: 'Poppins', sans-serif;
            }
            .navbar-brand {
                font-size: 1.75rem;
                font-weight: 600;
            }
            .nav-link {
                font-size: 1.25rem;
                font-weight: 500;
            }
            .navbar-toggler {
                border-color: transparent;
            }
            .navbar-toggler-icon {
                filter: invert(1);
            }
            .nav-item img {
                width: 28px;
            }
        </style>
    </head>
    <body>
        <div class="container-fluid d-flex justify-content-center">
            <nav class="navbar navbar-expand-lg navbar-dark">
                <div class="container-fluid">
                    <a class="navbar-brand" href="index.jsp">StyleHub</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                            <li class="nav-item active">
                                <a class="nav-link" href="index.jsp">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="about.jsp">About</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#" data-bs-toggle="modal" data-bs-target="#cart">
                                    <img src="images/cart-plus-solid.svg" alt="Cart" />
                                    <span class="ms-2 cart-items">( 0 )</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="login.jsp">Login</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="register.jsp">Register</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="javascript:void(0);" onclick="confirmLogout()">Log out</a>                        </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    </body>
</html>
