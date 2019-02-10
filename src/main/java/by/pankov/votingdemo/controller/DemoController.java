package by.pankov.votingdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

   @GetMapping("/")
    public String demoPage(){
       return "demo";
   }

}
