package Guia;

public class PercentualDiscount extends Discount {
  private double percentage;
  public PercentualDiscount(double percentage) {
    this.percentage = percentage;
  }
  public double calculateDiscount(double price) {
    return price * this.percentage / 100;
  }
}
