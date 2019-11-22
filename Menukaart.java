package KoffieHalen;
import java.util.ArrayList;

public class Menukaart {
	
	ArrayList<Koffie> drankjes = new ArrayList();
	
	void tonenKaart() {
		System.out.println("Dit staat er op de kaart");
		System.out.println("Wat wilt u bestellen? We hebben de volgende opties:");
		for(int x = 0; x < drankjes.size() ;x++) {
			System.out.println(drankjes.get(x).naam);
			
		}
		//Koffie.koffiezetten();
		//Slave.besteldrankje();
		System.out.println("De menukaart is klaar");
		
		
		
	}
	void voegDrankjeToe(Koffie d) {
		
	}

}
