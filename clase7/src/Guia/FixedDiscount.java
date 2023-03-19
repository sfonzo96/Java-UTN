package Guia;

public class FixedDiscount extends Discount {
  private double amount;
  public FixedDiscount(double amount) {
    this.amount = amount;
  }
  public double calculateDiscount(double price) {
    // If amount to discount > price, then it's free and therefore price - calculatedDiscount = 0
    return Math.min(price, this.amount);
  }
}
