<%@page import="app.classes.Category"%>
<%@page import="app.classes.Product"%>
<%@page import="app.classes.User"%>
<%@page import="app.classes.Order"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>

<%
    User user = (User) session.getAttribute("user");
    if (user == null || !"admin".equals(user.getRole())) {
        response.sendRedirect("login.jsp");
        return;
    }

    List<Category> categories = null;
    List<Product> products = null;
    int userCount = 0;
    int adminCount = 0;
    try {
        categories = Category.findAll();
        products = Product.findAll();
        userCount = User.getUserCount();
        adminCount = User.getAdminCount();
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle the exception appropriately
    }
%>



<%
    // ... (your existing code)
    int orderCount = 0;
    try {
        orderCount = Order.getOrderCount();
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle the exception appropriately
    }
%>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin Panel - Style Hub</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <style>
            .custom-card {
                border-radius: 15px;
                background-color: #d3d3d3; /* light gray background */
                cursor: pointer;
                transition: transform 0.2s ease-in-out;
            }

            .custom-card:hover {
                transform: scale(1.05);
            }

            .card-title {
                font-weight: 600;
            }

            .custom-card .card-text {
                color: #007bff;
                font-size: 1.1rem;
            }

            .plus-icon {
                font-size: 40px;
            }

            .add-category-card,
            .add-product-card {
                background-color: lightgray;
                padding: 2rem;
            }

            .add-category-card .card-title,
            .add-product-card .card-title {
                font-size: 1.5rem;
                font-weight: bold;
            }

            .add-category-card .card-text,
            .add-product-card .card-text {
                font-size: 1.2rem;
            }

            /* New styles for the tables */
            table {
                background-color: #f9f9f9; /* Light background color */
                text-align: center; /* Center align text in tables */
            }

            table th,
            table td {
                text-align: center; /* Center align text in table headers and cells */
                vertical-align: middle; /* Vertically center align text */
            }
        </style>

    </head>
    <body>
        <%@ include file="components/nav_bar.jsp" %>

        <div class="container mt-4">
            <h1 class="text-center mb-4">Admin Panel</h1>

            <div class="row justify-content-center">
                <div class="col-md-3 mb-4">
                    <div class="card custom-card text-center add-category-card" data-bs-toggle="modal" data-bs-target="#addCategoryModal">
                        <div class="card-body">
                            <h5 class="card-title"><span class="plus-icon">+</span>Add Category</h5>
                            <p class="card-text">Total Categories: <%= categories != null ? categories.size() : 0%></p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 mb-4">
                    <div class="card custom-card text-center add-product-card" data-bs-toggle="modal" data-bs-target="#addProductModal">
                        <div class="card-body">
                            <h5 class="card-title"><span class="plus-icon">+</span>Add Product</h5>
                            <p class="card-text">Total Products: <%= products != null ? products.size() : 0%></p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row justify-content-center">
                <div class="col-md-3 mb-4 pb-4">
                    <div class="card custom-card text-center bg-light">
                        <div class="card-body">
                            <h5 class="card-title">View Users Count</h5>
                            <p class="card-text">count: <%= userCount%></p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 mb-4 pb-4">
                    <div class="card custom-card text-center bg-light">
                        <div class="card-body">
                            <h5 class="card-title">View Admin Count</h5>
                            <p class="card-text">count: <%= adminCount%></p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 mb-4 pb-4">
                    <div class="card custom-card text-center bg-light">
                        <div class="card-body">
                            <h5 class="card-title">View Order Count</h5>
                            <p class="card-text">count: <%= orderCount%></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <h2 class="mt-5 mb-3">Categories</h2>
            <table class="table table-striped" border="4">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Details</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <% if (categories != null) { %>
                    <% for (Category category : categories) {%>
                    <tr id="category-<%= category.getCategoryid()%>">
                        <td><%= category.getCategoryid()%></td>
                        <td><%= category.getCategorytitle()%></td>
                        <td><%= category.getCategoryDescription()%></td>
                        <td>
                            <button class="btn btn-danger" onclick="deleteCategory(<%= category.getCategoryid()%>)">Delete</button>
                        </td>
                    </tr>
                    <% } %>
                    <% } else { %>
                    <tr>
                        <td colspan="4" class="text-center">No Categories Found</td>
                    </tr>
                    <% } %>
                </tbody>
            </table>

            <h2 class="mt-5 mb-3">Products</h2>
            <table class="table table-striped" border="4">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Details</th>
                        <th>Price</th>
                        <th>Discount</th>
                        <th>Category</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <% if (products != null) { %>
                    <% for (Product product : products) {%>
                    <tr id="product-<%= product.getProductid()%>">
                        <td><%= product.getProductid()%></td>
                        <td><%= product.getProductname()%></td>
                        <td><%= product.getProductdetails()%></td>
                        <td>Rs.<%= product.getProductprice()%></td>
                        <td><%= product.getProductdiscount()%>%</td>
                        <td>
                            <%
                                Category category = null;
                                try {
                                    category = Category.findById(product.getCategoryid());
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            %>
                            <%= category != null ? category.getCategorytitle() : "N/A"%>
                        </td>
                        <td>
                            <button class="btn btn-danger" onclick="deleteProduct(<%= product.getProductid()%>)">Delete</button>
                        </td>
                    </tr>
                    <% } %>
                    <% } else { %>
                    <tr>
                        <td colspan="4" class="text-center">No Products Found</td>
                    </tr>
                    <% } %>
                </tbody>
            </table>

            <h2 class="mt-5 mb-3">Orders</h2>
            <table class="table table-striped" border="4">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>Address</th>
                        <th>City</th>
                        <th>District</th>
                        <th>Shipping</th>
                        <th>Total Price</th>
                        <th>Order Date</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Order> orders = null;
                        try {
                            orders = Order.findAll();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        if (orders != null && !orders.isEmpty()) {
                            for (Order order : orders) {
                    %>
                    <tr id="order-<%= order.getOrderId()%>">
                        <td><%= order.getOrderId()%></td>
                        <td><%= order.getEmail()%></td>
                        <td><%= order.getContactNumber()%></td>
                        <td><%= order.getAddress()%></td>
                        <td><%= order.getCity()%></td>
                        <td><%= order.getDistrict()%></td>
                        <td><%= order.getShippingMethod()%></td>
                        <td>Rs.<%= order.getDiscountedPrice()%></td>
                        <td><%= order.getOrderDate()%></td>
                        <td>
                            <button class="btn btn-danger" onclick="deleteOrder(<%= order.getOrderId()%>)">Delete</button>
                        </td>
                    </tr>
                    <%
                        }
                    } else {
                    %>
                    <tr>
                        <td colspan="11" class="text-center">No Orders Found</td>
                    </tr>
                    <% } %>
                </tbody>
            </table>       





        </div>

        <!-- Add Category Modal -->
        <div class="modal fade" id="addCategoryModal" tabindex="-1" aria-labelledby="addCategoryModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="addCategoryModalLabel">Add Category</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form action="productServer" method="post" id="addCategoryForm" onsubmit="addCategory(event)">
                            <input type="hidden" name="operation" value="addcategory">
                            <div class="mb-3">
                                <input type="text" class="form-control" name="categorytitle" placeholder="Enter Category name" required>
                            </div>
                            <div class="mb-3">
                                <textarea class="form-control" name="categorydetails" placeholder="Enter Details about category" required style="height:150px;"></textarea>
                            </div>
                            <div class="text-center">
                                <button type="submit" class="btn btn-primary">Add Category</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- Add Product Modal -->
        <div class="modal fade" id="addProductModal" tabindex="-1" aria-labelledby="addProductModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="addProductModalLabel">Add Product</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form action="productServer" method="post"  id="addProductForm" onsubmit="addProduct(event)">
                            <input type="hidden" name="operation" value="addproduct">
                            <div class="mb-3">
                                <input type="text" class="form-control" name="productname" placeholder="Enter Product Title" required>
                            </div>
                            <div class="mb-3">
                                <textarea class="form-control" name="productdetails" placeholder="Enter Description of the product" style="height:150px;"></textarea>
                            </div>
                            <div class="mb-3">
                                <input type="number" class="form-control" name="productprice" placeholder="Enter Price of the Product" required>
                            </div>
                            <div class="mb-3">
                                <input type="number" class="form-control" name="productdiscount" placeholder="Enter Discount Percentage" required>
                            </div>
                            <div class="mb-3">
                                <input type="number" class="form-control" name="productquantity" placeholder="Enter Product Quantity" required>
                            </div>
                            <div class="mb-3">
                                <select name="categoryid" class="form-select">
                                    <% if (categories != null) { %>
                                    <% for (Category c : categories) {%>
                                    <option value="<%= c.getCategoryid()%>"><%= c.getCategorytitle()%></option>
                                    <% } %>
                                    <% }%>
                                </select>
                            </div>
                            <div class="mb-3">
                                <input type="text" class="form-control" id="product-pic" name="productpic" placeholder="Insert image url of the product" required>
                            </div>
                            <div class="text-center">
                                <button type="submit" class="btn btn-primary">Add Product</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>

        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <script src="./js/script.js"></script>
    </body>
</html>