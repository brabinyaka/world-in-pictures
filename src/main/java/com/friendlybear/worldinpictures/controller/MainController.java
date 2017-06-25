package com.friendlybear.worldinpictures.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Home page controller
 * <p>
 * Created by Tsvetoslav Tsvetanov - Delta Source Bulgaria on 6/25/17.
 */
@Controller
public class MainController {

    @GetMapping("/")
    private String homePage() {
        return "index.html";
    }
}
