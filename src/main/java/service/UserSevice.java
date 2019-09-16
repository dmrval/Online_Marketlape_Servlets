package service;

import entity.User;

import java.util.List;

/** Author - Damir_Valeev Created on 9/13/2019 */
public interface UserSevice {
  List<User> getAllUser();

  void addUser(User user);

  void updateUser(User user);

  void removeUser(int id);

  User getUser(int id);

  boolean userIsExist(User user);
}
