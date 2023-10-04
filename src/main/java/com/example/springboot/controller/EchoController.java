package com.example.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Creation Date: 2023-10-04 21:07</p >
 *
 * @author zhao.penglc
 * @version 1.1.0
 * @since Version 1.1.0
 */
@Slf4j
@RestController
public class EchoController {

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        log.debug("message: '{}'", message);
        return message;
    }
}
