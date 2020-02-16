package in.shop.ShopService.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AuthShopService implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Attribute-->  "+request.getAttribute("p1")+"******* "+request.getHeader("auth"));
		String token = request.getHeader("auth");
		
		//HttpSession session = request.getSession(false);
		if(token !=null) {
			//TODO validate the Token
			System.out.println("Authenticated request in Shop service");
			return true;
		} else {
			System.out.println("Not Authenticted in shop service");
			throw new Exception();
		}
	}

}
