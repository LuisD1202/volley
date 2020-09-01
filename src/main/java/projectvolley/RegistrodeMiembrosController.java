package projectvolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RegistrodeMiembrosController {

    @RequestMapping("/registrodemiembros")
    public String index() {
        return "Greetings from RegistrodeMiembrosController!";
    }

}
