package in.shop.ShopService.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ShopController {
	
	@GetMapping("/getCity")
	public String getShop() {
		return "Patiala";
	}

}
