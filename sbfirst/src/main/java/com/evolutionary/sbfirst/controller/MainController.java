package com.evolutionary.sbfirst.controller;

import com.evolutionary.sbfirst.SbfirstApplication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    private static final Logger LOGGER = LogManager.getLogger(MainController.class);

    @RequestMapping("/")
    public String welcome() {
        LOGGER.info("Entered index module");
        return "index.html";
    }
}
