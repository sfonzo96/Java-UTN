package Guia;

import java.time.LocalDate;
public class Product {
  private String name;
  private String description;
  private LocalDate createdAt;
  private int weightKg;
  private double price;
  private Boolean hasDiscount = false;
  private Discount discount = null;


  private static final double minPrice = 0.1;
  public Product(String name, double price) {
    this.name = name;
    this.createdAt = LocalDate.now();
    this.price = price > 0.1 ? price : minPrice;
  }

  public Product(String name, double price, Discount discount) {
    this.name = name;
    this.createdAt = LocalDate.now();
    this.price = price > 0.1 ? price : minPrice;
    this.hasDiscount = true;
    this.setDiscount(discount);
  }

  public void setDiscount(Discount discount) {
    this.discount = discount;
  }

  public String getName() {
    return this.name;
  }

  public double getDiscount() {
   return this.discount.calculateDiscount(this.price);
  }

  public double getPrice() {
    return this.price;
  }

  public Boolean getHasDiscount() {
    return this.hasDiscount;
  }

  public String getDescription() {
    return this.description;
  }

  public void setWeightKg(int weightKg) {
    this.weightKg = weightKg;
  }
  public void setDescription(String description) {
    this.description = description;
  }
}
