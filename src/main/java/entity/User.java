package entity;

import java.util.List;

public class User {
  String fullname;
  String address;
  String login;
  String password;
  List<Product> productList;


  public User(String fullname, String address, String login) {
    this.fullname = fullname;
    this.address = address;
    this.login = login;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
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

  public List<Product> getProductList() {
    return productList;
  }

  public void setProductList(List<Product> productList) {
    this.productList = productList;
  }
}
