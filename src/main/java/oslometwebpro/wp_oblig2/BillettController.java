package oslometwebpro.wp_oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BillettController {

    public final List<Billett> billettRegister = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKunde(Billett lagreBillett) {
        billettRegister.add(lagreBillett);
    }

    @GetMapping("/hentAlle")
    public List<Billett> hentAlle() {
        return billettRegister;
    }

    @GetMapping("/slettAlle")
    public void slettAlle() {
        billettRegister.clear();
    }

}
