package gps.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPage {

    @GetMapping("/")
    public String landingPageController() {
        return "views/landing-page.html";
    }
}
