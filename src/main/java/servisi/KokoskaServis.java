package servisi;

import interfejs.Zivotinja;
import modeli.Kokoska;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KokoskaServis {

    @Autowired
    private Zivotinja kokoska;

    public KokoskaServis() {
    }

    public KokoskaServis(Zivotinja kokoska) {
        this.kokoska = kokoska;
    }

    public void pokupiKokosku() {
        System.out.println("Način oglašavanja: " + kokoska.nacinOglasavanja());
        System.out.println("Da li si nahranio zivotinju? "
                + kokoska.nahraniZivotinju());
    }
}
