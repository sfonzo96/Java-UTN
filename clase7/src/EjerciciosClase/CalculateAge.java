package EjerciciosClase;
public class CalculateAge {
  public static void main(String[] args) {
    // Ejercicio 1 de clase 7
    String[] approved = {"math","physics"};
    Student student = new Student("1996-12-24", "Santiago", "40039039", 1996, approved);
    student.calculateAge();
  }
}
