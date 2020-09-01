package projectvolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LibrodeCartasController {

    @RequestMapping("/librodecartas")
    public String index() {
        return "Greetings from LibrodeCartasController!";
    }

}
