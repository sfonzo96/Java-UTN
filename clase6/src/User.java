public class User {
  private String username;
  private String password;
  private String email;
  private Boolean active;
  public User (String username,String password, String email ) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.active = true;
  }
  public String getUsername() {
    return username;
  }
  public String getEmail() {
    return email;
  }
  public String getPassword() {
    return password;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }


}
