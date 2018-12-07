package nagypeter.webshop.controller;

import static nagypeter.webshop.WebshopApplication.listOfAllShopItems;

import nagypeter.webshop.service.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class Index {

  @RequestMapping("/")
  public String indexSlash(Model model) {
    model.addAttribute("items", listOfAllShopItems.getListOfShopItems());
    return "index";
  }

  @RequestMapping("/only-available")
  public String onlyAvailable(Model model) {
    model.addAttribute("items", listOfAllShopItems.getListOfShopItems()
            .stream()
            .filter(ShopItem -> ShopItem.getQuantity() > 0)
            .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping("/cheapest-first")
  public String cheapestFirst(Model model) {
    model.addAttribute("items", listOfAllShopItems.getListOfShopItems()
            .stream()
            .sorted(Comparator.comparing(ShopItem::getPrice))
            .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping("/contains-nike")
  public String containsNike(Model model) {
    model.addAttribute("items", listOfAllShopItems.getListOfShopItems()
            .stream()
            .filter(ShopItem -> ShopItem.getDescription().toLowerCase().contains("nike")
            || ShopItem.getName().toLowerCase().contains("nike"))
            .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping("/avarage-stock")
  public String getAvarageStock(Model model) {
    int sumOfStock = 0;
    for (ShopItem item : listOfAllShopItems.getListOfShopItems()) {
      sumOfStock += item.getQuantity();
    }
    double avarageStock = sumOfStock / (double) listOfAllShopItems.getListOfShopItems().size();
    model.addAttribute("avarageStock", avarageStock);
    return "avarage-stock";
  }

  @RequestMapping("/most-expensive")
  public String getMostExpensive(Model model) {
    List<ShopItem> tempList = listOfAllShopItems.getListOfShopItems()
            .stream()
            .filter(shopItem -> shopItem.getQuantity() > 0)
            .sorted(Comparator.comparing(ShopItem::getPrice).reversed())
            .collect(Collectors.toList());
    model.addAttribute("items", tempList.get(0));
    return "index";
  }

}
