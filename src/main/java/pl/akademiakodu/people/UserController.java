package pl.akademiakodu.people;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class UserController {
    /*
        Fabryka Springa szuka klasy, które implementuje
        interfejs UserRepository i która jest Beanem(Componentem)
        OK Fabryka nie znajduje takiego Beana.
        Zgadaza się?
        TAK:)
        Ale nie generuje błędu tylko
        bierze generalcie klasy i tworzenie Beana
        na swoją klatę:)
        W locie generuje sobie tą klasę za nas.
     */
    @Autowired
    private UserRepository userRepository;

    // http://localhost:8080/demo/add?name=adam&email=adam@gmail.com
    @ResponseBody // zwraca Stringa
    @GetMapping("/add")
    public String add(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        userRepository.save(user);
        return "saved";
    }

    @ResponseBody
    @GetMapping("/all")
    public Iterable<User> getUsers(){
        return userRepository.findAll(); // zwraca wszystkich
    }





}
