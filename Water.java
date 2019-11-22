package KoffieHalen;

public class Water extends Drankje{
	float prijs = 0;
	String naam = "water";
	
	Water getWater() {
		Water w = new Water();
		System.out.println("Lekker verfrissend, hier is je water!");
		return w;
	}
}
