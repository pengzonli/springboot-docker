package com.example.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Creation Date: 2023-10-04 20:32</p >
 *
 * @author zhao.penglc
 * @version 1.0.0
 * @since Version 1.0.0
 */
@Slf4j
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/index"})
    public String index() {
        log.debug("/index");
        return "home";
    }
}
