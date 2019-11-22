package KoffieHalen;

import java.util.Scanner;

public class KoffieHalenApp {

    static Scanner sc = new Scanner(System.in);//ll

    public static void main(String[] args){
        System.out.println("hallo ga eens koffie halen");
        new Group().groepMaken();
        new Koffie().addSugar();
        new Drankje().drinken();

        new Slave().bestelDrankje();
    }
}
