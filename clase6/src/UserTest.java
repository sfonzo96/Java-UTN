public class UserTest {
  private String username;
  private String password;
  private String email;

  public UserTest(String[] userData) {
    this.username = userData[0];
    this.password = userData[1];
    this.email = userData[2];
    test();
  }

  // Test
  public void test() {
    if (usernameIsValid()) {
      System.out.println("Username is valid");
    } else System.out.println("Username is not valid");

    if (passwordIsValid()) {
      System.out.println("Password is valid");
    } else System.out.println("Password is not valid");

    if (emailIsValid()) {
      System.out.println("Email is valid");
    } else System.out.println("Email is not valid");
  }

  public Boolean usernameIsValid() {
    Boolean isValid = false;
    if (this.username.length() >= 4 && this.username.length() < 20) {
      return isValid = true;
    }
    return isValid;
  }

  public Boolean passwordIsValid() {
    Boolean isValid = false;
    if (this.password.length() >= 6 && this.password.length() < 30) {
      return isValid = true;
    }
    return isValid;
  }

  public Boolean emailIsValid() {
    Boolean isValid = false;
    if (
            this.email.contains("@")
                    && this.email.contains(".")
                    && this.email.length() >= 6
                    && this.email.length() < 40
    ) {
      return isValid = true;
    }
    return isValid;
  }
}
