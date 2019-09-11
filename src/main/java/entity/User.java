package entity;

public class User {
  String fullname;
  String address;
  String login;
  String password;

  public User() {}

  public User(String fullname, String address, String login) {
    this.fullname = fullname;
    this.address = address;
    this.login = login;
  }

  private User(String fullname, String address, String login, String password) {
    this.fullname = fullname;
    this.address = address;
    this.login = login;
    this.password = password;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

