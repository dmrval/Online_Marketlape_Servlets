package entity;

import javax.ejb.Local;
import javax.ejb.Stateless;

/** Author - Damir_Valeev Created on 9/21/2019 */

@Stateless
@Local(IShow.class)
public class ShowTest implements IShow {
  public void showMe() {
    System.out.println("This is test");
  }
}
