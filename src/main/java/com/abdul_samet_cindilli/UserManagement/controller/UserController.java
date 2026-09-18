package com.abdul_samet_cindilli.UserManagement.controller;

import com.abdul_samet_cindilli.UserManagement.model.User;
import com.abdul_samet_cindilli.UserManagement.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserServiceImpl UserServiceImpl;
    public UserController(UserServiceImpl UserServiceImpl) {
        this.UserServiceImpl = UserServiceImpl;
    }

    @GetMapping("adduser")
    public String addUser(Model model){
        model.addAttribute("user", new User());
        return "adduser";
    }

    @GetMapping("/listuser")
    public String listUser(Model model){
        model.addAttribute("users",UserServiceImpl.findAll());
        return "listuser";
    }

    @GetMapping("/updateuser")
    public String updateUser(@RequestParam("id") Long thisId, Model model){
        model.addAttribute("user",UserServiceImpl.findById(thisId));
        return  "updateuser";
    }

    @PostMapping("/saveuser")
    public String saveUser(@ModelAttribute("user") User user){
        UserServiceImpl.save(user);
        return "redirect:/listuser";
    }

    @GetMapping("/deleteuser{id}")
    public String deleteUser(@RequestParam("id") Long id){
        UserServiceImpl.delete(id);
        return "redirect:/listuser";
    }
}
