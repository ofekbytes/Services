package jaron.utilities;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

  @GetMapping("/today")
  public String welcome(Model model) {
    model.addAttribute("today", LocalDate.now().toString());
    return "welcome" + LocalDate.now().toString();
  }
}
