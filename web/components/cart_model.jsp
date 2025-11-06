<!-- Cart Model -->
<div class="modal fade" id="cart" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
        <div class="modal-header">
        <h1 class="modal-title fs-4" id="exampleModalLabel">Selected Items</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body cart-body">
        <!-- Cart items will be dynamically updated here -->
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        
        <button type="button" class="btn btn-primary checkout-btn" onclick="goToCheckout()">Checkout</button>
      </div>
    </div>
  </div>
</div>