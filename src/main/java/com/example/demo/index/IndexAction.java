package com.example.demo.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexAction {
    @RequestMapping(value = "/hello")
    public String index() {
        return "Hello World";
    }
}
