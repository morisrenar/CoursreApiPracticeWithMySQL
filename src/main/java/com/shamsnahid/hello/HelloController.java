package com.shamsnahid.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bmshamsnahid on 7/23/17.
 */
@RestController
public class HelloController {

    @RequestMapping(method=RequestMethod.POST, value = "/hello")
    public String sayHello() {
        return "Hello World!!!";
    }
}
