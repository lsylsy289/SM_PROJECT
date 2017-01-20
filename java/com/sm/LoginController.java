package com.sm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by LEE on 2017. 1. 20..
 */

@Controller
public class LoginController {

    @RequestMapping(value = "/login.do")
    public String getLogin() {

        System.out.println("aaaa aaa");

        return "/login";
    }
}
