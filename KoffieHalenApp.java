package KoffieHalen;

import java.util.Scanner;

public class KoffieHalenApp {
    static Scanner sc = new Scanner(System.in);//ll

    public static void main(String[] args){
        System.out.println("KOFFIEE!");
        new Group().groepMaken();
        WarmDrankje koffie = new WarmDrankje();
        koffie.warmDrank("koffie");
        new Menukaart().tonenKaart();

        new Slave().bestelDrankje();

    }
}
