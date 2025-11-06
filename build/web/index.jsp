<%@page import="app.classes.Category"%>
<%@page import="app.classes.Product"%>
<%@page import="app.classes.User"%>
<%@page import="java.util.List"%>
<!doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Style Hub</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>

    <body>
        <%@ include file="components/nav_bar.jsp" %>
        
        <%
            List<Category> categories = Category.findAll();

            String cat = request.getParameter("category");
            List<Product> products = null;
            if (cat != null) {
                products = Product.findByCategoryID(Integer.parseInt(cat));
            } else {
                products = Product.findAll();
            }
            if (cat == null) {
                cat = "9999999";
            }
        %>

        
        <%@include file = "components/cart_model.jsp" %>
        
        

        <div class="row">
            <div class="col-md-3">
                <ul class="list-group m-5">
                    <a href="index.jsp" class="list-group-item list-group-item-action <%= cat.equals("9999999") ? "active" : ""%>">
                        All
                    </a>
                    <% for (Category c : categories) {%>
                    <a href="index.jsp?category=<%= c.getCategoryid()%>" class="list-group-item list-group-item-action <%= (c.getCategoryid() == Integer.parseInt(cat)) ? "active" : ""%>">
                        <%= c.getCategorytitle()%>
                    </a>
                    <% } %>
                </ul>
            </div>
            <div class="col-md-9">
                <div class=" my-5">
                    <div class="row col-md-12">
                        <% for (Product p : products) {%>
                        <div class="col-md-3 mx-3 mb-3 shadow-sm pb-3">
                            <div class="container text-center p-3">
                                <img src="<%= p.getProductpic()%>" class="card-img-top img-fluid" alt="Product image" style="max-height: 250px; object-fit: cover;">
                            </div>

                            <div class="card-body text-center">
                                <h5 class="card-title font-weight-bold text-truncate"><%= p.getProductname()%> </h5>
                                <p class="card-text text-muted text-truncate"><%= p.getProductdetails()%></p>
                            </div>
                            <div class="card-footer text-center bg-white border-0">
                                <div class="price-info align-items-center">
                                    <span class="text-success font-weight-bold mr-2">&#8360; <%= p.getPriceAfterDiscount()%></span>
                                    <span class="text-muted mx-2" style="text-decoration: line-through;">&#8360; <%= p.getProductprice()%></span>
                                    <span class="text-danger">(<%= p.getProductdiscount()%>% off)</span>
                                </div>
                                    <button class="btn btn-primary my-2" onclick="addToCart(<%= p.getProductid()%>, '<%= p.getProductname()%>', <%= p.getPriceAfterDiscount()%>)"> <i style="font-size: 20px;">+</i> Select Item</button>
                            </div>
                        </div>
                        <% }%>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

        <script src="./js/script.js"></script>
    </body>

</html>