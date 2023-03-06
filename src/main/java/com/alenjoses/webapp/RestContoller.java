package com.alenjoses.web;

import com.alenjoses.webapp.WebAppApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestContoller {

    @RequestMapping("hello")
    @ResponseBody
    public String helloWorld(){

        return "Hey ! Hello World";
    }

}
