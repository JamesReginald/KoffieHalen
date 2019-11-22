package KoffieHalen;

import java.util.Scanner;

public class KoffieHalenApp {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("hallo ga eens koffie halen");
        new Group().groepMaken();
        new Menukaart().tonenKaart();
        new Koffie().addSugar();

    }
}
