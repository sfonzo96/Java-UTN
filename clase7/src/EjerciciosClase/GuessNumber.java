package EjerciciosClase;

import java.util.Scanner;
public class GuessNumber implements Game {
  private int number;
  private Scanner userNumber;
  private int tries;

  public GuessNumber() {
    this.tries = 1;
  }

  public void start() {
    number = 1 + (int) (Math.random() * 100);
    System.out.println("EjerciciosClase.Game initiated, now you can play!");
  }
  public void play() {
    start();
    // Tiene que pedir numero y si falla debe decir si es más grande  o menor que el ingresado,
    // luego vuelve a preguntar y dice el numero de intentos
    System.out.println("Choose your number:");
    Scanner userInput = new Scanner(System.in);
    setUserNumber(userInput);
    int userNumber = this.userNumber.nextInt();


    while (this.number != userNumber) {
      checkIfInputIsBigger(userNumber);
      userInput = new Scanner(System.in);
      setUserNumber(userInput);
      userNumber = this.userNumber.nextInt();
      setTries(this.tries + 1);
    }

    end();
  }

  public void end() {
    System.out.printf("Congratulations! You guessed the number in %d tries",this.tries);
  }

  public void checkIfInputIsBigger(int userNumber) {
    if (this.number < userNumber) {
      System.out.println("Entered number is bigger than chosen. Try again:");
    } else {
      System.out.println("Entered number is smaller than chosen. Try again:");
    }
  }

  public int getTries() {
    return tries;
  }

  public void setTries(int tries) {
    this.tries = tries;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public Scanner getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(Scanner input) {
    this.userNumber = input;
  }
}

