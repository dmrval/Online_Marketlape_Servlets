package service;

import dao.UserDao;
import entity.User;

import java.util.List;

/** Author - Damir_Valeev Created on 9/13/2019 */
public class UserServiceImpl implements UserSevice {

  UserDao userDao;

  @Override
  public List<User> getAllUser() {
    return userDao.getAllUser();
  }

  @Override
  public void addUser(User user) {
    userDao.addUser(user);
  }

  @Override
  public void updateUser(User user) {
    userDao.updateUser(user);
  }

  @Override
  public void removeUser(int id) {
    userDao.removeUser(id);
  }

  @Override
  public User getUser(int id) {
    return userDao.getUser(id);
  }

  @Override
  public boolean userIsExist(User user) {
//    List<User> tmpUserList = getAllUser();
//    for (User u : tmpUserList) {
//      if (u.getLogin().equals(user.getLogin()) && u.getFullname().equals(user.getFullname())) {
//        return true;
//      }
//    }
    /** When add DATABASE modify this */
    return true;
  }
}
