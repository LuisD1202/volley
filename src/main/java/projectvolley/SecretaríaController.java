package projectvolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SecretaríaController {

    @RequestMapping("/secretaría")
    public String index() {
        return "Greetings from SecretaríaController!";
    }

}
