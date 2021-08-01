package com.node.springboot.web;


import com.node.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping(value = "/user/detail")
    public ModelAndView userDetail()
    {
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setId(1001);
        user.setUsername("lisi");
        user.setAge(18);
        mv.setViewName("userDetail");
        mv.addObject("user",user);
        return mv;
    }
    @RequestMapping("/url")
    public String urlExpression(Model model)
    {
        return "url";
    }
}
