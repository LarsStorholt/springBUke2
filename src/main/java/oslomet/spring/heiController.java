package oslomet.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/*public Arraylist<Kunde>kunderegister*/

@RestController
public class heiController {
    @PostMapping("/")
    public Kunde enKunde(Kunde innKunde){
        return innKunde;
    }
}
