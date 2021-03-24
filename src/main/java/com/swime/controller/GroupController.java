package com.swime.controller;

import com.swime.domain.SampleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/group/*")
public class GroupController {

    @GetMapping("/home")
    public String home(SampleDTO dto) {
        return "home";
    }
}
