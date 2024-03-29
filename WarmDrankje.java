package KoffieHalen;
import java.util.Scanner;

public class WarmDrankje extends Drankje{
	boolean suiker = false;
	boolean melk = false;
	int sterkte = 1;
	
	private void setStrength(int strength) {
		if (strength < 1) {
			strength = 1;
		}else if(strength > 3) {
			strength = 3;
		}
		sterkte = strength;
		System.out.println("Sterkte: " + sterkte);
	}
	
	WarmDrankje warmDrank(String koffieThee) {
		WarmDrankje kopje = new WarmDrankje();
		kopje.naam = koffieThee;
		Scanner input = new Scanner(System.in);
		
		
		boolean nietAkkoord = true;
		while(nietAkkoord) {
			System.out.println("Suiker? [J]a [N]ee");
			String s = input.next().toUpperCase();
			if(s.equals("J")){
				kopje.suiker = true;
				System.out.println("Suiker toegevoegd.");
			}else if(s.equals("N")){
				kopje.suiker = false;
				System.out.println("Geen suiker toegevoegd.");
			}
			System.out.println("Melk? [J]a [N]ee");
			String m = input.next().toUpperCase();
			if(m.equals("J")){
				kopje.melk = true;
				System.out.println("Melk toegevoegd.");
			}else if(m.equals("N")){
				kopje.melk = false;
				System.out.println("Geen melk toegevoegd.");
			}
			
			System.out.println("Sterkte: [1] [2] [3]");
			int c = input.nextInt();
			kopje.setStrength(c);
			

			System.out.println("Uw order: "+kopje.naam);
			System.out.println("Suiker: " + kopje.suiker);
			System.out.println("Melk: " + kopje.melk);
			System.out.println("Sterkte: " + kopje.sterkte);
			
			System.out.println("Akkoord? [J]a [N]ee");
			String a = input.next().toUpperCase();
			if(a.equals("J")) {
				nietAkkoord = false;
			}
		}
		input.close();

		return kopje;
		
	}
}




