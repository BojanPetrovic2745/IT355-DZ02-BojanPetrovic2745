package modeli;

import interfejs.Zivotinja;

public class Kokoska implements Zivotinja {

    public Kokoska() {
    }

    @Override
    public String nacinOglasavanja() {
        return "Ko ko da";
    }

    @Override
    public String nahraniZivotinju() {
        return "Kokoska narhanjena";
    }
    
}
