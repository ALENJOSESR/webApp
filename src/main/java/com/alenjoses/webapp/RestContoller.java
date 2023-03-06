package com.alenjoses.webapp;

import com.alenjoses.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestContoller  {



    @GetMapping("hello")
    public String helloWorld(){
        System.out.print("called");

        return "Hey ! Hello World";
    }
    @GetMapping("hello-bean")
    public HelloWorldBean helloworldBean(){

        return new HelloWorldBean("Hello World");
    }

    @GetMapping("mylist/{name}")
    public String getMyName(@PathVariable String name)
    {
        return "Hello " + name;

    }


}
