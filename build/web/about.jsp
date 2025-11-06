<%-- 
    Document   : about
    Created on : Aug 10, 2024, 7:15:09 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About Us - StyleHub</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #e0e0e0;
            min-height: 100vh;
            display: flex;
            align-items: center;
        }
        .container {
            background-color: #ffffff;
            border-radius: 20px;
            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.1);
            padding: 50px;
        }
        .logo {
            font-size: 1.8em;
            color: #333;
            font-weight: bold;
        }
		.text-decoration-none{
			margin-left:15px;
			font-weight:bold;
		}
        .about-images img {
            border-radius: 50%;
            width: 150px;
            height: 150px;
            border: 5px solid #ffffff;
            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.1);
            object-fit: cover;
        }
        .contact-box {
            height: 100%;
            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>


<body>
     
    <div class="container">
        <header class="row mb-5">
            <div class="col-md-6">
                <div class="logo"></div>
            </div>
           <%@ include file="components/nav_bar.jsp" %>
        </header>
        <main>
            <div class="row mb-5 align-items-center">
                <div class="col-lg-6 mb-4 mb-lg-0">
                    <h2 class="mb-4">Hello! <br>About Us</h2>
                    <p class="text-secondary">StyleHub is your go-to destination for trendy and stylish clothing. We offer a curated selection of fashion-forward pieces that combine quality and comfort, ensuring you always look and feel your best. Discover your unique style with us today!</p>
                </div>
                <div class="col-lg-6">
                    <div class="about-images d-flex justify-content-around">
                        <img src="images/tshirt.jpeg" alt="Clothing Item 1" class="img-fluid">
                        <img src="images/watch.jpeg" alt="Clothing Item 2" class="img-fluid d-none d-md-block">
                        <img src="images/cap.jpeg" alt="Clothing Item 3" class="img-fluid d-none d-lg-block">
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-3 mb-md-0">
                    <div class="card contact-box">
                        <div class="card-body text-center">
                            <h5 class="card-title">Mobile</h5>
                            <p class="card-text">055-7865467</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 mb-3 mb-md-0">
                    <div class="card contact-box">
                        <div class="card-body text-center">
                            <h5 class="card-title">Email</h5>
                            <p class="card-text">stylehub@gmail.com</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card contact-box">
                        <div class="card-body text-center">
                            <h5 class="card-title">Address</h5>
                            <p class="card-text">No.29, Main street, Badulla</p>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>

    <!-- Bootstrap JS (optional, for certain components) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>