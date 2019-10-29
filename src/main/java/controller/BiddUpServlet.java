package controller;

import entity.AuctionProductInfo;
import entity.Bidder;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Author - Damir_Valeev Created on 9/19/2019 */
@WebServlet("/biddUp")
public class BiddUpServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    User u = (User) req.getSession().getAttribute("currentUser");
    double upTo = Double.parseDouble(req.getParameter("biddLot"));
    AuctionProductInfo au =
        ShowItemsServlet.usersHelper.getAuctionByInfo(req.getParameter("biddInfo"));
    if (au.getBidder().getBidderOffer() < upTo) {
      au.setBidder(new Bidder(upTo, u));
      req.getRequestDispatcher("/showItems").forward(req, resp);
    }
  }
}
