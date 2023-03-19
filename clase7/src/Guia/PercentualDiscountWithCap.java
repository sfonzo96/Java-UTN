package Guia;

public class PercentualDiscountWithCap extends Discount {
  private double percentage;
  private double cap;
  public PercentualDiscountWithCap(double percentage, double cap) {
    this.percentage = percentage;
    this.cap = cap;
  }
  public double calculateDiscount(double price) {
    double discount = price * this.percentage / 100;
    if (discount > this.cap) {
      return cap;
    }
    return discount;
  }
}
