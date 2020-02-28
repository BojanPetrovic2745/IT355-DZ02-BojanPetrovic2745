package modeli;

import interfejs.Zivotinja;

public class Pas implements Zivotinja {

    public Pas() {
    }
 
    @Override
    public String nacinOglasavanja() {
        return "Wouf!";
    }

    @Override
    public String nahraniZivotinju() {
        return "Pas nahranjen";
    }
    
}
