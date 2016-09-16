package com.vantage.controllers;

/**
 * Created by harsha on 9/16/16.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    //controller method to show the form
    @RequestMapping("/showForm")
    public String showForm(){
        return "form";
    }

    //controller method to process the form

}
