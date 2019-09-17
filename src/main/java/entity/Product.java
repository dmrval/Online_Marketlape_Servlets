package entity;

/** Author - Damir_Valeev Created on 9/12/2019 */
public class Product {
  int uid;
  String nameProduct;
  String description;
  int startPrice;
  int stepLevel;
  double time;
  User userMaster;

  public Product(int uid, String nameProduct, String description, int startPrice, int stepLevel, double time, User userMaster) {
    this.uid = uid;
    this.nameProduct = nameProduct;
    this.description = description;
    this.startPrice = startPrice;
    this.stepLevel = stepLevel;
    this.time = time;
    this.userMaster = userMaster;
  }

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

  public String getNameProduct() {
    return nameProduct;
  }

  public void setNameProduct(String nameProduct) {
    this.nameProduct = nameProduct;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getStartPrice() {
    return startPrice;
  }

  public void setStartPrice(int startPrice) {
    this.startPrice = startPrice;
  }

  public int getStepLevel() {
    return stepLevel;
  }

  public void setStepLevel(int stepLevel) {
    this.stepLevel = stepLevel;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public User getUserMaster() {
    return userMaster;
  }

  public void setUserMaster(User userMaster) {
    this.userMaster = userMaster;
  }
}
