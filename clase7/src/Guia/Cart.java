package Guia;

public class Cart {

  private CartItem[] items;
  private double subtotal;
  private int totalQuantity;

  public Cart(CartItem[] items) {
    this.items = items;
    this.setTotalQuantity();
    this.setSubtotal();
  }

  private void setTotalQuantity() {
    for (int i = 0; i < this.items.length; i++) { // for loop executes only if element is a non-null value (same for for-each?)
      this.totalQuantity++;
    }
  }
  public void setItems(CartItem[] items) {
    this.items = items;
  }
  private void setSubtotal() {
    double subtotal = 0.0;
    int index = 0;
    for (CartItem item : items) {
      subtotal = subtotal + item.getProductTotal();
      index++;
    }
    this.subtotal = subtotal;
  }
  public int getTotalQuantity() {
    return this.totalQuantity;
  }
  public double getSubtotal() {
    return this.subtotal;
  }
  public double getSubtotal( Discount discount) {
    // When instanced the cart subtotal without discount is set.
    // When this method (with Discount parameter) is called, will take that subtotal and then subtract discount from it
    return this.subtotal - discount.calculateDiscount(this.subtotal);
  }

  public CartItem[] getItems() {
    return this.items;
  }
}
