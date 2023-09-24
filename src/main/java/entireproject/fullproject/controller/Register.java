package entireproject.fullproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import entireproject.fullproject.Repository.devotionalrepo;
import entireproject.fullproject.Repository.foodrepo;
import entireproject.fullproject.Repository.imagerepo;
import entireproject.fullproject.Repository.movierepo;
import entireproject.fullproject.Repository.userrepository;
import entireproject.fullproject.model.devotional;
import entireproject.fullproject.model.foods;
import entireproject.fullproject.model.gallery;
import entireproject.fullproject.model.movie;
import entireproject.fullproject.model.user;

@Controller

public class Register {

    @Autowired
    private userrepository userrepository;

  @Autowired
  private imagerepo imagerepo;

 @Autowired
 private devotionalrepo devotionalrepo;


 @Autowired
 private movierepo movierepo;

 @Autowired
 private foodrepo foodrepo;




    @GetMapping("/index")
    public String viewHomepage(){
        return "index" ;
    }






    
    @GetMapping("/register")
public String showRegistrationForm(Model model) {
    model.addAttribute("user", new user());
     
    return "signup_form";

    
}



@PostMapping("/process_register")
public String processRegister(user user) {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    String encodedPassword = passwordEncoder.encode(user.getPassword());
    user.setPassword(encodedPassword);
     
    userrepository.save(user);
     
    return "index";
}






@GetMapping("/login")
public String sets(){
  return "login" ;
}



@GetMapping("/users")
public String listUsers(Model model) {
    List<user> listUsers = userrepository.findAll();




    model.addAttribute("listUsers", listUsers);
     
    return "users";
}


//normal

 @GetMapping("/gallery")
 public String listimages(Model model){

    //gallery

 List<gallery> galleries=imagerepo.findAll();

 model.addAttribute("listgallery", galleries);

//devotional

 List<devotional> devo=devotionalrepo.findAll();

 model.addAttribute("listdevotional", devo);

//foods

 List<foods> food=foodrepo.findAll();

 model.addAttribute("listfoods", food);

//movies

List<movie> movie=movierepo.findAll();

model.addAttribute("listmovies", movie);



 return "gallery" ;
 }









}
