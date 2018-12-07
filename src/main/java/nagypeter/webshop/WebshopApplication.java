package nagypeter.webshop;

import nagypeter.webshop.service.AllShopItems;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebshopApplication {

  public static AllShopItems listOfAllShopItems = new AllShopItems();

  public static void main(String[] args) {
    SpringApplication.run(WebshopApplication.class, args);
  }

}
