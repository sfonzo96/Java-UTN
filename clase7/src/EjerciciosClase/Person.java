package EjerciciosClase;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
  private LocalDate birthDate;
  private String name;
  private String id;
  public Person(String birthDate, String name, String id) {
    this.birthDate = LocalDate.parse(birthDate);
    this.name = name;
    this.id = id;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int calculateAge() {
    int ages = Period.between(this.birthDate, LocalDate.now()).getYears();
    System.out.println(ages);
    return ages;
  }
}
