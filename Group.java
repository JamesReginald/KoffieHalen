package KoffieHalen;

import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    ArrayList<Slave> group  = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public ArrayList<Slave> groepMaken(){
        try{
            System.out.println("hoeveel mensen");
            int groepSize = sc.nextInt();

            for (int i = 0; i < groepSize; i++){
                Slave slave = new Slave();
                System.out.println("type naam + enter");
                String name = sc.next();
                slave.setName(name);
                group.add(slave);
                System.out.println(slave.getName());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return group;
    }

}
