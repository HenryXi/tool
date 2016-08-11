package com.henryxitool;

import com.henryxitool.entity.Json;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToolController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/json")
    public String formatJson(Json json) {
        return "json";
    }
}
