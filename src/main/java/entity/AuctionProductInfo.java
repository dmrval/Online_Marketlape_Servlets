package entity;

/** Author - Damir_Valeev Created on 9/19/2019 */
public class AuctionProductInfo {
  double startPrice;
  double stepLevel;
  Bidder bidder;
  double time;
  User master;


  public AuctionProductInfo(double startPrice, double stepLevel, double time, User master) {
    this.startPrice = startPrice;
    this.stepLevel = stepLevel;
    this.time = time;
    this.master = master;
  }

  public double getStartPrice() {
    return startPrice;
  }

  public void setStartPrice(double startPrice) {
    this.startPrice = startPrice;
  }

  public double getStepLevel() {
    return stepLevel;
  }

  public void setStepLevel(double stepLevel) {
    this.stepLevel = stepLevel;
  }

  public Bidder getBidder() {
    return bidder;
  }

  public void setBidder(Bidder bidder) {
    this.bidder = bidder;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public User getMaster() {
    return master;
  }

  public void setMaster(User master) {
    this.master = master;
  }
}
