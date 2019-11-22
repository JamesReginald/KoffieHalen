package KoffieHalen;

import java.util.Scanner;

public class Slave {

    private String name;

    private Koffie koffie;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Koffie getKoffie() {
        return koffie;
    }

    public void setKoffie(Koffie koffie) {
        this.koffie = koffie;
    }

    Koffie bestelDrankje() {
        System.out.println("Bestel een drankje");
        System.out.println();
        Koffie koffie = new Koffie();

        System.out.println("Heeft u suiker in uw koffie? typ [Y] voor ja, [N] voor nee");
        String suikerInput = KoffieHalenApp.sc.nextLine().toUpperCase();

        while (!suikerInput.equals("Y") && !suikerInput.equals("N")) {
            System.out.println("Ongeldig antwoord!");
            System.out.println("Heeft u suiker in uw koffie? typ [Y] voor ja, [N] voor nee");
            suikerInput = KoffieHalenApp.sc.nextLine().toUpperCase();
        }

        System.out.println("U heeft gekozen voor: " + suikerInput);

        if (suikerInput.equals("Y")){
            koffie.suiker = true;
            System.out.println("Koffie met suiker");
        } else {
            System.out.println("Koffie zonder suiker");
        }

        System.out.println("Heeft u melk in uw koffie? typ [Y] voor ja, [N] voor nee");
        String melkInput = KoffieHalenApp.sc.nextLine().toUpperCase();

        while (!melkInput.equals("Y") && !melkInput.equals("N")) {
            System.out.println("Ongeldig antwoord!");
            System.out.println("Heeft u melk in uw koffie? typ [Y] voor ja, [N] voor nee");
            melkInput = KoffieHalenApp.sc.nextLine().toUpperCase();
        }

        System.out.println("U heeft gekozen voor: " + melkInput);

        if (melkInput.equals("Y")){
            koffie.melk = true;
            System.out.println("Koffie met melk");
        } else {
            System.out.println("Koffie zonder melk");
        }

        return koffie;
    }
}
