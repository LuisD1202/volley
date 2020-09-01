package projectvolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AdministraciónController {

    @RequestMapping("/administración")
    public String index() {
        return "Greetings from AdministraciónController!";
    }

}
