package KoffieHalen;

import java.util.Scanner;

public class Koffie {
	String naam = "Koffie";
	boolean suiker = false;
	boolean melk = false;
	int sterkte;
	boolean bekertje;
	float prijs = (float)1.50;
	
	String besteller;
	
	void addSugar() {
		suiker = true;
		System.out.println("suiker toegevoegd.");
	}
	void removeSugar() {
		suiker = false;
		System.out.println("suiker verwijdert.");
	}
	
	void addMilk() {
		melk = true;
		System.out.println("melk toegevoegd.");
	}
	void removeMilk() {
		melk = false;
		System.out.println("melk verwijdert.");
	}
	
	void setStrength(int strength) throws Exception {
		if (strength < 1 || strength > 3) {
			throw new Exception();
		}
		sterkte = strength;
		System.out.println("Sterkte: " + sterkte);
	}
	/*
	void setKoffie() {
		Scanner input = new Scanner(System.in);
		
		suiker = sugar;
		melk = milk;
		sterkte = strength;
		bekertje = cup;
	}
	*/
}
