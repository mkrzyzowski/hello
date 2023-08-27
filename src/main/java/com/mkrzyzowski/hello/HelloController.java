package com.mkrzyzowski.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/sum")
    @ResponseBody
    public String sum(@RequestParam Integer a, @RequestParam Integer b) {
        return String.format("Sum of numbers %d and %d is %d", a, b, a + b);
    }
}
