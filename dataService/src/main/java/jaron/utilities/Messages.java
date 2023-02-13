package jaron.utilities;

import java.time.LocalDate;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Messages {

	public Messages() {	}

	@RequestMapping("/")
	public String home(Model welcome) {		
		welcome.addAttribute("welcome", "Welcome to the Home Page !");
		return "<h1>Welcome....</h1> ";
//		return "test.html";
	}
	
	@RequestMapping("/test") 
	public ModelAndView test(Model welcome) {
		welcome.addAttribute("localDate", LocalDate.now().toString());
		welcome.addAttribute("welcome", "Welcome to the Home Page !");
		welcome.addAttribute("userName", System.getProperty("user.name"));
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("static/html/home2.html");
		return modelAndView;
	}
	
	@RequestMapping("/date")
	public String getDate(Model welcome) {
		
		welcome.addAttribute("welcome", "Welcome to the Home Page !");
		return "Date: " + LocalDate.now().toString();
	}

	@RequestMapping("/welcome")
	public String sayHi() {
		return "<div> <h1>Welecome </h1> <h2>" + System.getProperty("user.name") + " , Welcome Back</h2> </div>";
	}

}// 1
