package KoffieHalen;
import java.util.ArrayList;

public class Drankje {
	
	String naam;
	int prijs;
	int hoeveelheid;
	String kleur;
	
	void drinken() {
		System.out.println("We zijn in drinken");
		ArrayList<Drankje> drankjes = new ArrayList();
		drankjes.add(new Drankje());
		Drankje thee = new Drankje();
		thee.naam= "Thee";
		drankjes.add(thee);
		
		Drankje water = new Drankje();
		water.naam = "Water";
		drankjes.add(water);
		
		Drankje koffie = new Drankje();
		koffie.naam = "Koffie";
		drankjes.add(koffie);
		
		
		
		System.out.println("Wat wilt u bestellen? We hebben de volgende opties:");
		for(int x = 0; x < drankjes.size() ;x++) {
			System.out.println(drankjes.get(x).naam);
			
		}
		
		
		
		
		
	}
	

}
