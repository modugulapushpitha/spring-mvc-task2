package com.stackroute;
import com.stackroute.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @RequestMapping("/login")
    public ModelAndView validate(HttpServletRequest request, HttpServletResponse response){
        String req1=request.getParameter("username");
        String req2=request.getParameter("password");
        User uobj=new User(req1,req2);
        ModelAndView obj=new ModelAndView();
        obj.setViewName("display");
        obj.addObject("username",req1);
        obj.addObject("password",req2);
        return obj;
    }

}
