package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Random;
import java.util.UUID;

/**
 * Created by feini on 2017/6/4.
 */
@RestController
@RequestMapping("/rest")
public class HelloController {
    @RequestMapping("/test")
    public String test(HttpSession session) {
        Random r = new Random();
        session.setAttribute("boot:" + r.nextLong(), UUID.randomUUID()
                .toString());
        return "rest:controller:hello:world";
    }
}
