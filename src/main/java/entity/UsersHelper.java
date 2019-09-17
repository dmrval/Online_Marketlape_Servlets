package entity;

import java.util.ArrayList;
import java.util.List;

/** Author - Damir_Valeev Created on 9/16/2019 */
public class UsersHelper {
  public static List<User> allUsers = new ArrayList<>();

  public UsersHelper() {
    User currentUser = new User("Ivanov Ivan Ivanovich", "Stepnaya 9", "IVAN", Sex.MR);
    currentUser
        .getProductList()
        .add(new Product(321312, "Soap", "Soap for Bubbles", 40, 10, 1, currentUser));
    currentUser
        .getProductList()
        .add(new Product(3123123, "Glass boll", "Glass boll", 3232, 102, 11, currentUser));

    User secondUser = new User("Mockachino Ludmila Petrovna", "Горького 16", "Ludmila", Sex.MRS);
    secondUser
        .getProductList()
        .add(new Product(321312, "Water", "water", 430, 1320, 132, secondUser));

    User annaBorisovna =
        new User("Mihal4yk Anna Borisovna", "40 лет непонятных дел 15", "Anna", Sex.MRS);
    annaBorisovna.getProductList().add(new Product(3213312, "Juice", "juice", 80, 5, 0.5, secondUser));
    allUsers.add(currentUser);
    allUsers.add(secondUser);
  }

  public List<User> getAllUsers() {
    return allUsers;
  }

  public void setAllUsers(List<User> allUsers) {
    this.allUsers = allUsers;
  }

  public static User getUserByUserName(String username) {
    for (User tmp : allUsers) {
      if (tmp.getFullname().equals(username)) {
        return tmp;
      }
    }
    return new User("NotFound", "NotFound", "NotFound", Sex.MR);
  }
}
