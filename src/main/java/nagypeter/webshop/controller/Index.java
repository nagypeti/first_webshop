package nagypeter.webshop.controller;

import static nagypeter.webshop.WebshopApplication.listOfAllShopItems;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

  @RequestMapping("")
  public String indexNull(Model model) {
    model.addAttribute("items", listOfAllShopItems.getListOfShopItems());
    return "index";
  }

  @RequestMapping("/")
  public String indexSlash(Model model) {
    model.addAttribute("items", listOfAllShopItems.getListOfShopItems());
    return "index";
  }

}
