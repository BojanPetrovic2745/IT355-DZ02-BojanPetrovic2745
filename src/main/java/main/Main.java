package main;

import konfiguracija.Konfiguracija;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import servisi.KokoskaServis;
import servisi.OvcaServis;
import servisi.PasServis;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("classpath:config.xml");

        /*
            new AnnotationConfigApplicationContext(Konfiguracija.class)
            
            se koristi za java konfiguraciju
         */
        KokoskaServis kokoskaServis
                = (KokoskaServis) context.getBean("kokoskaServis");

        OvcaServis ovcaServis
                = (OvcaServis) context.getBean("ovcaServis");

        PasServis pasServis
                = (PasServis) context.getBean("pasServis");

        ovcaServis.pokupiOvcu();

        pasServis.pokupiPsa();

        kokoskaServis.pokupiKokosku();
    }
}
