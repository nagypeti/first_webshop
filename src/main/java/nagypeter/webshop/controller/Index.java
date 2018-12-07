package nagypeter.webshop.controller;

import static nagypeter.webshop.WebshopApplication.listOfAllShopItems;

import nagypeter.webshop.service.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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
    model.addAttribute("items", listOfAllShopItems.getListOfShopItems().stream()
            .filter(ShopItem -> ShopItem.getQuantity() > 0)
            .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping("/cheapest-first")
  public String cheapestFirst(Model model) {
    model.addAttribute("items", listOfAllShopItems.getListOfShopItems().stream()
            .sorted(Comparator.comparing(ShopItem::getPrice))
            .collect(Collectors.toList()));
    return "index";
  }

}
