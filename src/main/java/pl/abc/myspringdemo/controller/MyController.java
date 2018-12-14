package pl.abc.myspringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.jws.WebParam;

@Controller
public class MyController {
    @GetMapping({"/","/home"})
    public  String welcome()
    {
        return "welcome";
    }

    @GetMapping
    public String myImpala(Model model)
    {
        model.addAttribute("brand","Chevrolet");
        model.addAttribute("model", "Impala");

        return"car";
    }


}
