package Guia;

import java.time.LocalDate;
public class Product {
  private String name;
  private String description;
  private LocalDate createdAt;
  private int weightKg;
  private double price;

  private static final double minPrice = 0.1;
  public Product(String name, double price) {
    this.name = name;
    this.createdAt = LocalDate.now();
    this.price = price > 0.1 ? price : minPrice;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
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
