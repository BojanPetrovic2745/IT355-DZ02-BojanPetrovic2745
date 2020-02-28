package konfiguracija;

import interfejs.Zivotinja;
import modeli.Kokoska;
import modeli.Pas;
import modeli.Ovca;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import servisi.KokoskaServis;
import servisi.OvcaServis;
import servisi.PasServis;

@Configuration
public class Konfiguracija {
    
    @Bean(name="kokoskaServis")
    public KokoskaServis getKokoskaServis(){
        return new KokoskaServis();
    }
    
    @Bean(name="kokoska")
    public Zivotinja getKokoska(){
        return new Kokoska();
    }
    
    @Bean(name="ovcaServis")
    public OvcaServis getOvcaServis(){
        return new OvcaServis();
    }
    
    @Bean(name="ovca")
    public Zivotinja getOvca(){
        return new Ovca();
    }
    
    @Bean(name="pasServis")
    public PasServis getPasServis(){
        return new PasServis();
    }
    
    @Bean(name="pas")
    public Zivotinja getPas(){
        return new Pas();
    }
}