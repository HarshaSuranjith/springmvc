package com.vantage.controllers;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by harsha on 9/16/16.
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex(){
        return "index";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String showForm(){
        return "form";
    }

    @RequestMapping(value = "/confirm", method = RequestMethod.GET)
    public String showConfirm(){
        return "confirm";
    }
}
