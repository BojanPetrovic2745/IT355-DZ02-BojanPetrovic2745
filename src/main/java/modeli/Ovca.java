package modeli;

import interfejs.Zivotinja;

public class Ovca implements Zivotinja {
    
    public Ovca() {
    }

    @Override
    public String nacinOglasavanja() {
        return "Be";
    }

    @Override
    public String nahraniZivotinju() {
        return "Ovca nahranjena";
    }
    
}
