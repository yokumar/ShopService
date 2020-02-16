package in.shop.ShopService.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigService implements WebMvcConfigurer  {
	
	@Autowired
	private AuthShopService authShopService; 

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(authShopService).addPathPatterns("/**","/*");
	}
}
