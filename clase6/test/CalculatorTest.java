import Guia.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  // Tests para cada método de Calculator
  @Test
  void add() {
    Calculator calculator = new Calculator();
    double result = calculator.add(500,190);
    assertEquals(690, result, 0);
  }

  @Test
  void subtract() {
    Calculator calculator = new Calculator();
    double result = calculator.subtract(500,190);
    assertEquals(310, result, 0);
  }

  @Test
  void multiply() {
    Calculator calculator = new Calculator();
    double result = calculator.multiply(500,190);
    assertEquals(95000, result, 0);
  }

  @Test
  void divide() {
    Calculator calculator = new Calculator();
    double result = calculator.divide(500,200);
    assertEquals(2.5, result, 0);
  }

  // Tests de casos sugeridos
  // El resultado de multiplicar 80 por 3 da 240
  @Test
  void test1() {
    Calculator calculator = new Calculator();
    double product = calculator.multiply(80,3);
    assertEquals(240, product, 0);
  }

  // El resultado de sumar 150 y 180, dividido por 3, da 110
  @Test
  void test2() {
    Calculator calculator = new Calculator();
    double sum = calculator.add(150,180);
    double quotient = calculator.divide(sum,3);
    assertEquals(110, quotient,0);
  }

  // El resultado de restar 90 y 50, multiplicado por 15, no da 605.
  @Test
  void test3() {
    Calculator calculator = new Calculator();
    double rest = calculator.subtract(90,50);
    double product = calculator.multiply(rest, 15);
    assertNotEquals(605, product, 0);
  }

  // El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.
  @Test
  void test4() {
    Calculator calculator = new Calculator();
    double sum = calculator.add(70,40);
    double product = calculator.multiply(sum,25);
    assertNotEquals(2700, product, 0);
  }
}