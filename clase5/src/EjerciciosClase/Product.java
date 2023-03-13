package EjerciciosClase;

import java.time.LocalDate;
public class Product {
  private String name;
  private String description;
  private LocalDate createdAt;
  private Integer weightKg;
  private Double price;

  private static final Double minPrice = 0.1;
  public Product(String name) {
    this.name = name;
    this.createdAt = LocalDate.now();
    this.price = minPrice;
  }

  public Product(String name, Double price) {
    this.name = name;
    this.createdAt = LocalDate.now();
    this.price = price > 0.1 ? price : minPrice;
  }

  public String getName() {
    return this.name;
  }

  public Double getPrice() {
    return this.price;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
