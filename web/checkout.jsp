<%@page import="app.classes.User"%>
<%@page import="app.classes.Category"%>
<%@page import="app.classes.Product"%>
<%@page import="java.util.List"%>

<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        session.setAttribute("errorMessage", "Please login to proceed with checkout.");
        response.sendRedirect("login.jsp");
        return;
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Checkout</title>
        <style>
            .card {
                background-color: lightgray;
                border-radius: 15px;
                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
            }

            .form-control {
                background-color: lightgray;
                border-radius: 15px;
                border: none;
                padding: 12px 20px;
            }

            .form-control:focus {
                outline: none;
                box-shadow: 0 0 5px rgba(81, 203, 238, 1);
            }

            .btn-outline-success, .btn-outline-primary {
                border-radius: 15px;
                padding: 10px 20px;
                font-size: 16px;
                transition: all 0.3s ease-in-out;
            }

            .btn-outline-success:hover, .btn-outline-primary:hover {
                transform: scale(1.05);
            }
        </style>
    </head>
    <body style="background-color: ">

        <%@include file = "components/nav_bar.jsp" %>

        <div class="container">
            <div class="row mt-5">

                <div class="col-md-6">
                    <!-- Card detail -->
                    <div class="card">
                        <div class="card-body">
                            <h3 class="text-center mb-5">Your selected Items</h3>
                            <div class="cart-body">
                                <!-- Cart items will be displayed here -->
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-6">
                    <!-- Form details -->
                    <div class="card">
                        <div class="card-body">
                            <h3 class="text-center mb-5">Your Details for the Order</h3>
                            <form action="PlaceOrderServlet" method="post">
                                <input type="number" name="user_id" value="<%= user.getUserId()%>" hidden>
                                <div class="mb-3">
                                    <label for="exampleInputEmail1" class="form-label">Email address</label>
                                    <input value="<%= user.getUseremail()%>" name="email" type="email" class="form-control" id="mailAddress" aria-describedby="emailHelp" placeholder="Enter email">
                                    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                                </div>

                                <div class="mb-3">
                                    <label for="exampleInputName" class="form-label">Your name</label>
                                    <input value="<%= user.getUsername()%>" name="name" type="text" class="form-control" id="name" aria-describedby="nameHelp" placeholder="Enter your name">
                                    <div id="nameHelp" class="form-text">We'll never share your information with anyone else.</div>
                                </div>

                                <div class="mb-3">
                                    <label for="exampleInputContact" class="form-label">Your Contact number</label>
                                    <input value="<%= user.getUserphone()%>" name="contactNumber" type="text" class="form-control" id="contactNumber" aria-describedby="contactHelp" placeholder="Enter Contact number">
                                    <div id="contactHelp" class="form-text">We'll never share your contact number with anyone else.</div>
                                </div>

                                <div class="mb-3">
                                    <label for="exampleFormControlTextarea1" class="form-label">Your address for the order</label>
                                    <textarea class="form-control" name="address" id="orderAddress" rows="3" placeholder="Enter Your Address"><%= user.getUseraddress()%></textarea>
                                </div>

                                <div class="mb-3">
                                    <label for="city" class="form-label">City</label>
                                    <input type="text" name="city" class="form-control" id="city" placeholder="Enter your city">
                                </div>

                                <div class="mb-3">
                                    <label for="district" class="form-label">District</label>
                                    <input type="text" name="district" class="form-control" id="district" placeholder="Enter your district">
                                </div>

                                <div class="mb-3">
                                    <label for="shippingCode" class="form-label">Shipping Code</label>
                                    <input type="text" name="shippingCode" class="form-control" id="shippingCode" placeholder="Enter shipping code">
                                </div>

                                <div class="mb-3">
                                    <label class="form-label">Shipping Method</label>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="shippingMethod" id="speedPost" value="speedPost">
                                        <label class="form-check-label" for="speedPost">
                                            Speed Post
                                        </label>
                                    </div>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="shippingMethod" id="normalPost" value="normalPost">
                                        <label class="form-check-label" for="normalPost">
                                            Normal Post
                                        </label>
                                    </div>
                                </div>

                                <div class="mb-3">
                                    <label for="discountedPrice" class="form-label">Discounted Price</label>
                                    <input type="text" class="form-control" name="discountedPrice" id="discountedPrice" placeholder="Discounted Price" readonly>
                                </div>

                                <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                                    <button class="btn btn-outline-success" type="submit">Order Now</button>
                                    <button class="btn btn-outline-primary" type="button" onclick="window.location.href = 'index.jsp'">Select more items for order</button>
                                    <button class="btn btn-outline-clear" type="reset">Clear</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </div>

        <%@include file="components/cart_model.jsp"%>
        <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

        <script src="./js/script.js"></script>
        <script>
                                        $(document).ready(function () {
                                            // Fetch the discounted price and update the field
                                            var discountedPrice = updateCart();
                                            $('#discountedPrice').val(discountedPrice.toFixed(2));
                                        });
        </script>
    </body>
</html>