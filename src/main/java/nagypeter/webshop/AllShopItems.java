package nagypeter.webshop;

import java.util.ArrayList;

public class AllShopItems {

  ArrayList<ShopItem> listOfShopItems;

  public AllShopItems() {
    listOfShopItems = new ArrayList<>();
    listOfShopItems.add(new ShopItem("Coca Cola", "0.5l standard coke",
            25.0, 0));
    listOfShopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce",
            119.0, 100));
    listOfShopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike",
            300.0, 1));
    listOfShopItems.add(new ShopItem("Running shoes", "Nike running shoes, just do it!",
            1000.0, 5));
    listOfShopItems.add(new ShopItem("Printer", "Some HP printer",
            3000.0, 2));
  }

  public ArrayList<ShopItem> getListOfShopItems() {
    return listOfShopItems;
  }
}
