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

    @RequestMapping(value = "/hello")
    public String index1() {
        return "Hello World";
    }

    @RequestMapping(value = "/hello")
    public String index2() {
        return "Hello World";
    }
    @RequestMapping(value = "/hello")
    public String indexTest1() {
        return "Hello World";
    }

    @RequestMapping(value = "/hello")
    public String indexTest2() {
        return "Hello World";
    }
}
