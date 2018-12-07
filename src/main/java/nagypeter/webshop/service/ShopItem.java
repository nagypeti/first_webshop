package nagypeter.webshop.service;

public class ShopItem {

  String name;
  String description;
  double price;
  int quantity;

  public ShopItem(String name, String description, double price, int quantity) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

}
