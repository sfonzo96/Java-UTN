package Guia;


public class CalculatorTest {

  // El resultado de multiplicar 80 por 3 da 240
  public static void test1() {
    Calculator calculator = new Calculator();
    double product = calculator.multiply(80,3);
    if (product == 240) {
      System.out.println("Test #1 Successful.");
    } else {
      System.out.println("Test #1 Failed.");
    }
  }

  // El resultado de sumar 150 y 180, dividido por 3, da 110
  public static void test2() {
    Calculator calculator = new Calculator();
    double sum = calculator.add(150,180);
    double quotient = calculator.divide(sum,3);
    if (quotient == 110) {
      System.out.println("Test #2 Successful.");
    } else {
      System.out.println("Test #2 Failed.");
    }
  }

  // El resultado de restar 90 y 50, multiplicado por 15, no da 605.
  public static void test3() {
    Calculator calculator = new Calculator();
    double rest = calculator.subtract(90,50);
    double product = calculator.multiply(rest, 15);
    if (product != 605) {
      System.out.println("Test #3 Successful.");
    } else {
      System.out.println("Test #3 Failed.");
    }
  }

  // El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.
  public static void test4() {
    Calculator calculator = new Calculator();
    double sum = calculator.add(70,40);
    double product = calculator.multiply(sum,25);
    if (product != 2700) {
      System.out.println("Test #4 Successful.");
    } else {
      System.out.println("Test #4 Failed.");
    }
  }

  public static void main(String[] args) {
    test1();
    test2();
    test3();
    test4();
  }
}
