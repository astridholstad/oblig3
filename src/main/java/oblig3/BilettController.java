package oblig3;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Collections;


@RestController
public class BilettController{

     @Autowired
     BiletterRepo rep;

    @PostMapping("/lagre")
    public void lagreBilett(Biletter innBilett)
    {
        rep.lagreBilett(innBilett);
    }

    @GetMapping("/hentAlle")
    public List<Biletter> hentAlle() {
        return rep.hentAlleBiletter();
    }
    @GetMapping("/slettAlle")
    public void slettAlle()
    {
        rep.slettAlleBiletter();
    }
}