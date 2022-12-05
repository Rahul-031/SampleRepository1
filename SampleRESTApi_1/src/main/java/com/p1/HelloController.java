
package com.p1;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "Hello Top G's welcome to code this Rishi A";
    }
}