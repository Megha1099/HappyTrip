package org.accenture.happy_trip.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class MyController
{
    @GetMapping("/")
    public String loadHome() {
        return "home.html";
    }
    @GetMapping("login")
    public String login() {
        return "login.html";
    }
    @GetMapping("signup")
    public String signup() {
        return "signup.html";
    }
    @PostMapping("signup")
    public String saveUser() {
        
        return null;
    }
    

  @GetMapping("forgotp")
  public String forgotp() {
      return "forgotp.html";
  }
 
 
  
  
  
    
    
    
    

}
