package eCommerce.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	// Controller for Home
	@RequestMapping("/home")
	public String showHome(Model m) {

		m.addAttribute("pageinfo", "home");

		return "home";
	}

	// Controller for Login
	@RequestMapping("/login")
	public String showLogin(Model m) {

		m.addAttribute("pageinfo", "login");

		return "login";
	}

	// Controller for Registration
	@RequestMapping("/register")
	public String showRegister(Model m) {

		m.addAttribute("page", "register");

		return "register";
	}

	// Controller for AboutUs
	@RequestMapping("/aboutus")
	public String showAboutus(Model m) {

		m.addAttribute("pageinfo", "aboutus");

		return "aboutus";
	}

	// Controller for Contact
	@RequestMapping("/contact")
	public String showContact(Model m) {

		m.addAttribute("pageinfo", "contact");

		return "contact";
	}

}
