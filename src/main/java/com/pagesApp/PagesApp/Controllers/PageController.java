package com.pagesApp.PagesApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {
        @RequestMapping("/home")
       public String home(org.springframework.ui.Model model) {
              model.addAttribute("name", "Pages Application");
              model.addAttribute("letterboxd", "https://letterboxd.com/sid5878/");
              return "home";
       }

@RequestMapping("/about")
public String about(Model model){
       //model.addAttribute("isLogin", false);
    return "about";
}
@RequestMapping("/help")
public String help(){
       return "help";
}
///////////////////////////// Just for testing isLogin

@RequestMapping("/login")
public String login(Model model){
       model.addAttribute("isLogin", true);
       return about(model);
}


}
