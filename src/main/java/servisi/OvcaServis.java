package servisi;

import interfejs.Zivotinja;
import modeli.Ovca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OvcaServis {

    @Autowired
    private Zivotinja ovca;

    public OvcaServis() {
    }

    public OvcaServis(Zivotinja ovca) {
        this.ovca = ovca;
    }

    public void pokupiOvcu() {
        System.out.println("Način oglašavanja: " + ovca.nacinOglasavanja());
        System.out.println("Da li si nahranio zivotinju? "
                + ovca.nahraniZivotinju());
    }
}
