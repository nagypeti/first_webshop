package nagypeter.webshop.service;

import java.util.ArrayList;
import java.util.List;

public class AllShopItems {

  List<ShopItem> listOfShopItems;

  public AllShopItems() {
    listOfShopItems = new ArrayList<>();
    fillWithDemoItems();
  }

  private void fillWithDemoItems() {
    listOfShopItems.add(new ShopItem("Coca Cola", "0.5l standard coke",
            25, 0));
    listOfShopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce",
            119, 100));
    listOfShopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike",
            300, 1));
    listOfShopItems.add(new ShopItem("Running shoes", "Nike running shoes, just do it!",
            1000, 5));
    listOfShopItems.add(new ShopItem("Printer", "Some HP printer",
            3000, 2));
  }

  public List<ShopItem> getListOfShopItems() {
    return listOfShopItems;
  }

}
