package com.wkcto.dubbo.web;


import com.wkcto.dubbo.model.User;
import com.wkcto.dubbo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/user")
    public String userDetail(Model model, Integer id)
    {
        User user = userService.queryUserById(id);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
