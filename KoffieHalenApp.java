package KoffieHalen;

public class KoffieHalenApp {
    public static void main(String[] args){
        System.out.println("hallo ga eens koffie halen");
        new Slave().groepMaken();
        new Koffie().addSugar();
        new Drankje().drinken();
    }
}
