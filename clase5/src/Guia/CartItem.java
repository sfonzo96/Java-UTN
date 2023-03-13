package Guia;

public class CartItem {
  private Product product;
  private int quantity = 1;
  private double total;

  public CartItem(Product product) {
    setProductTotal();
  }
  public CartItem(Product product, int quantity) {
    this.product = product;
    this.quantity = quantity;

    setProductTotal();
  }
  public void setQuantity(int  quantity) {
    this.quantity = quantity;
  }

  public void setProductTotal() {
    if (product.getHasDiscount()) {
      this.total = (this.product.getPrice() - this.product.getDiscount()) * this.quantity;
    } else {
      this.total = this.product.getPrice() * this.quantity;
    }
  }

  public double getProductTotal() {
    return this.total;
  }
}
