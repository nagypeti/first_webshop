package nagypeter.webshop.controller;

import nagypeter.webshop.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static nagypeter.webshop.WebshopApplication.listOfAllShopItems;
import java.util.ArrayList;
import java.util.List;


@Controller
public class OnlyAvailable {

  @RequestMapping("/only-available")
  public String onlyAvailable(Model model) {
    List<ShopItem> availableItems = new ArrayList<>();
    for (ShopItem item : listOfAllShopItems.getListOfShopItems()) {
      if (item.getQuantity() > 0) {
        availableItems.add(item);
      }
    }
    model.addAttribute("items", availableItems);
    return "only-available";
  }

}
