package Guia;

public class PercentualDiscount extends Discount {
  private double percentaje;
  public PercentualDiscount(double percentaje) {
    this.percentaje = percentaje;
  }
  public double calculateDiscount(double price) {
    return price * this.percentaje / 100;
  }
}
