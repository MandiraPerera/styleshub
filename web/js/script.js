// Function to add item to the cart
function addToCart(pid, pname, price) {
    let cart = localStorage.getItem("cart");
    let message = '';

    if (cart == null) {
        let products = [];
        let product = { productId: pid, productName: pname, productQuantity: 1, productPrice: price };
        products.push(product);
        localStorage.setItem("cart", JSON.stringify(products));
        message = `${pname} added successfully`;
    } else {
        let pcart = JSON.parse(cart);
        let oldProduct = pcart.find(item => item.productId === pid);
        if (oldProduct) {
            oldProduct.productQuantity += 1;
            pcart = pcart.map(item => item.productId === oldProduct.productId ? oldProduct : item);
            localStorage.setItem("cart", JSON.stringify(pcart));
            message = `Your selected product quantity increased to ${oldProduct.productQuantity}`;
        } else {
            let product = { productId: pid, productName: pname, productQuantity: 1, productPrice: price };
            pcart.push(product);
            localStorage.setItem("cart", JSON.stringify(pcart));
            message = `${pname} added successfully`;
        }
    }

    updateCart();
    showToast(message);
}

// Function to show toast messages
function showToast(message) {
    const existingToasts = document.querySelectorAll('.toast');
    existingToasts.forEach(toast => toast.remove());

    let toastContainer = document.getElementById('toast-container');
    if (!toastContainer) {
        toastContainer = document.createElement('div');
        toastContainer.id = 'toast-container';
        toastContainer.className = 'position-fixed top-0 end-0 p-3';
        toastContainer.style.zIndex = '1050';
        document.body.appendChild(toastContainer);
    }

    const toastElement = document.createElement('div');
    toastElement.className = 'toast';
    toastElement.role = 'alert';
    toastElement.ariaLive = 'assertive';
    toastElement.ariaAtomic = 'true';
    toastElement.innerHTML = `
        <div class="toast-header">
            <strong class="me-auto">Notification</strong>
            <button type="button" class="btn-close" data-bs-dismiss="toast" aria-label="Close"></button>
        </div>
        <div class="toast-body">
            ${message}
        </div>
    `;

    toastContainer.appendChild(toastElement);
    const toast = new bootstrap.Toast(toastElement);
    toast.show();
}



// Function to add a category
function addCategory(event) {
    event.preventDefault();
    $.ajax({
        url: 'productServer',
        type: 'POST',
        data: $('#addCategoryForm').serialize(),
        success: function (response) {
            showToast('Category added successfully');
            $('#addCategoryModal').modal('hide');
            location.reload(); // Reload the page to show the new category
        },
        error: function () {
            showToast('Error adding category');
        }
    });
}

// Function to add a product
function addProduct(event) {
    event.preventDefault();
    $.ajax({
        url: 'productServer',
        type: 'POST',
        data: new FormData($('#addProductForm')[0]),
        processData: false,
        contentType: false,
        success: function (response) {
            showToast('Product added successfully');
            $('#addProductModal').modal('hide');
            location.reload(); // Reload the page to show the new product
        },
        error: function () {
            showToast('Error adding product');
        }
    });
}


// Function to update cart details
function updateCart() {
    let cartString = localStorage.getItem("cart");
    let cart = JSON.parse(cartString);
    if (cart == null || cart.length == 0) {
        $(".cart-items").html("( 0 )");
        $(".cart-body").html("<h3>No items selected yet</h3>");
        $(".checkout-btn").attr('disabled', true);
    } else {
        $(".cart-items").html(`(${cart.length})`);

        let totalPrice = 0;
        let table = `
            <table class='table'>
                <thead class='thead-light'>
                    <tr>
                        <th>Item Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Total Price</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
        `;

        cart.forEach((item) => {
            let itemTotalPrice = item.productQuantity * item.productPrice;
            totalPrice += itemTotalPrice;
            table += `
                <tr>
                    <td>${item.productName}</td>
                    <td>Rs.${item.productPrice}</td>
                    <td>${item.productQuantity}</td>
                    <td>Rs.${itemTotalPrice}</td>
                    <td>
                        <button class="btn btn-danger btn-sm" onclick="removeFromCart(${item.productId})">Remove</button>
                    </td>
                </tr>
            `;
        });

        // Calculate the discount
        let discountPercentage = 4;
        let discountAmount = (totalPrice * discountPercentage) / 100;
        let discountedPrice = totalPrice - discountAmount;

        table += `
                </tbody>
            </table>
            <div class="fw-bold fs-4 mb-2">
                <span class="text-danger" style="text-decoration: line-through; border-bottom: 1.5px dashed red; padding-bottom: 5px;">
                    Total Price: Rs.${totalPrice}.00
                </span><br><br>
                <span class="text-success" style="border-bottom: 3px double green; padding-bottom: 5px;">
                    Discounted Price: Rs.${discountedPrice.toFixed(2)}
                </span>
            </div>
        `;

        $(".cart-body").html(table);
        $(".checkout-btn").attr('disabled', false);

        // Return the discounted price
        return discountedPrice;
    }
}

// Function to get the discounted price
function getDiscountedPrice() {
    $.ajax({
        url: 'getDiscountedPriceServlet',
        type: 'GET',
        success: function (response) {
            $('#discountedPrice').val(response.discountedPrice);
        },
        error: function () {
            console.error('Failed to fetch discounted price.');
        }
    });
}

// Call the getDiscountedPrice function when the document is ready
$(document).ready(function () {
    getDiscountedPrice();
});

// Function to remove item from cart
function removeFromCart(pid) {
    let cart = JSON.parse(localStorage.getItem("cart"));
    cart = cart.filter(item => item.productId !== pid);
    localStorage.setItem("cart", JSON.stringify(cart));
    updateCart();
    showToast('Item removed from cart');
}

// Function to navigate to checkout page
function goToCheckout() {
    window.location = "checkout.jsp";
}

// Function to delete a category
function deleteCategory(categoryid) {
    if (confirm("Are you sure you want to delete this category?")) {
        $.ajax({
            url: 'deleteCategoryServlet',
            type: 'POST',
            data: { id: categoryid },
            success: function (response) {
                showToast('Category deleted successfully');
                $(`#category-${categoryid}`).remove();
            },
            error: function () {
                showToast('Please Delete all the product according to categody rather than deleting the category first');
            }
        });
    }
}

// Function to delete a product
function deleteProduct(productid) {
    if (confirm("Are you sure you want to delete this product?")) {
        $.ajax({
            url: 'deleteProductServlet',
            type: 'POST',
            data: { id: productid },
            success: function (response) {
                showToast('Product deleted successfully');
                $(`#product-${productid}`).remove();
            },
            error: function () {
                showToast('Error deleting product');
            }
        });
    }
}

// Function to handle the category form submission




//;;;;;;;;;;;;;;;;;

// Function to confirm logout
function confirmLogout() {
    if (window.confirm("Are you sure you want to log out?")) {
        window.location.href = "logout.jsp";
    }
}


// Initialize when document is ready
$(document).ready(function () {
    updateCart();

});


function deleteOrder(orderId) {
    if (confirm("Are you sure you want to delete this order?")) {
        $.ajax({
            url: 'DeleteOrderServlet',
            type: 'POST',
            data: { orderId: orderId },
            success: function(response) {
                showToast('Order deleted successfully');
                $(`#order-${orderId}`).remove();
            },
            error: function() {
                showToast('Error deleting order');
            }
        });
    }
}