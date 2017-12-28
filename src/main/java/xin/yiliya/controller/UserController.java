package xin.yiliya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user",method = RequestMethod.GET)
public class UserController {

    @RequestMapping(value = "/index.html",method = RequestMethod.GET)
    public String index(){
        return "user";
    }
}
