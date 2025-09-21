package com.test.githubActionsDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/hello")
    public Object getObjectDetails() {
        Map<String, String> object = new HashMap<>();
        object.put("name", "veeru");
        object.put("phone", "919191");
        return object;

    }
}
