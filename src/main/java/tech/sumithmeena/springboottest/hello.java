package tech.sumithmeena.springboottest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @GetMapping("/hello")
    public String hello1() {
        return "Hello World";
    }
}
