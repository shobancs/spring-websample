package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/api/hello")
    public String index() {
        return "Hello Greetings from Spring Boot !";
    }
    @RequestMapping("/api/hello-pr")
    public String index() {
    	sysout
        return "Hello Praveen!";
    }
}
