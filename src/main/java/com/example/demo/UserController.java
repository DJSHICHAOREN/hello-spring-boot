package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping(value = "users")
    public List<User> userList(){
        return userRepository.findAll();
    }

    @PostMapping(value = "users")
    public User userAdd(@RequestParam("name") String name, @RequestParam("age") Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);

        return userRepository.save(user);
    }

    @GetMapping(value = "users/{id}")
    public User userGetOne(@PathVariable("id") Integer id){
        return userRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "users/{id}")
    public User userUpdate(@PathVariable("id") Integer id,
                           @RequestParam("name") String name,
                           @RequestParam("age") Integer age){

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);

        return userRepository.save(user);
    }

    @DeleteMapping(value = "users/{id}")
    public void userDelete(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }

    @GetMapping(value = "users/age/{age}")
    public List<User> userFindByAge(@PathVariable Integer age){
        return userRepository.findAllByAge(age);
    }

    @PostMapping(value = "/users/two")
    public void userAddTwo(){
        userService.insertTwo();
    }

}
