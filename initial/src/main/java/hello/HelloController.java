package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/api/hello")
    public String index() {
        return "Hello Greetings from Spring Boot !";
    }
    
    @RequestMapping("/api/hellovasu")
    public String indexVasu() {
        return "Hello Greetings from Spring Boot Vasantha!";
    }
    

    @RequestMapping("/api/hello-shoban")
    public String indexshoban() {
        return "Hello Shoban !";
    }

    @RequestMapping("/api/hello-vasu")
    public String indexvasu() {
        return "Hello Vasanthaa1 !";
    }

}

}
