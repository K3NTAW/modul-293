package BBW_Kenta.com.Website_Spring_Initializr_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class greetingcontroller {


    @GetMapping ("/greeting")
    public String Welcome (){
        return "greeting";
    }

}
