package zoo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import zoo.fisch.*;
import zoo.säugetier.*;
import zoo.vogel.*;

/**
 * Beinhaltet die Main und alle anderen benötigten Methoden
 * @author Sebastian Niederegger
 */

public class Zooverwaltung {

	private ArrayList<Tier> tiere = new ArrayList<Tier>();

	/**
	 * Fügt Tier t zur ArrayList(Tier) hinzu
	 * @param t  übergebener Parameter vom Typ Tier
	 */
	
	private void addTier (Tier t) {
		
		if (t == null) {
			System.out.println("Kein Tier wurde übergeben!");
			return;
		}
		
		tiere.add(t);
	}
	
	/**
	 * Fügt (zahl) Fische zur ArrayList(Tier) hinzu
	 * @param zahl  Gibt an, wie viele Fische hinzugefügt werden sollen
	 */
	
	private void addFisch (int zahl) {
		
		for (int i = 0; i < zahl; i++) {
			int tmp = random (2);
		
			switch (tmp) {
			
			case 0:
			
				Lachs lachs = new Lachs ("Lachs");
				
				tiere.add(lachs);
				
				break;
			
			case 1:
				
				Hai hai = new Hai ("Hai");
				
				tiere.add(hai);
				
				break;
			}
		}
	}
	
	/**
	 * Fügt (zahl) Säugetiere zur ArrayList(Tier) hinzu
	 * @param zahl  Gibt an, wie viele Säugetiere hinzugefügt werden sollen
	 */
	
	private void addSäugetier (int zahl) {
		
		for (int i = 0; i < zahl; i++) {
			int tmp = random (2);
		
			switch (tmp) {
			
			case 0:
			
				Affe affe = new Affe ("Affe");
				
				tiere.add(affe);
				
				break;
			
			case 1:
				
				Känguru känguru = new Känguru ("Känguru");
				
				tiere.add(känguru);
				
				break;
			}
		}
	}
	
	/**
	 * Fügt (zahl) Vögel zur ArrayList(Tier) hinzu
	 * @param zahl  Gibt an, wie viele Vögel hinzugefügt werden sollen
	 */
	
	private void addVogel (int zahl) {
		
		for (int i = 0; i < zahl; i++) {
			int tmp = random (2);
		
			switch (tmp) {
			
			case 0:
			
				Taube taube = new Taube ("Taube");
				
				tiere.add(taube);
				
				break;
			
			case 1:
				
				Pinguin pinguin = new Pinguin ("Pinguin");
				
				tiere.add(pinguin);
				
				break;
			}
		}
	}
	
	/**
	 * Gibt alle Fische, die in der ArrayList(Tier) sind, zurück
	 * @return neue ArrayList mit allen gefundenen Fischen
	 */
	
	private ArrayList<Fisch> getFisch () {
		
		ArrayList<Fisch> fische = new ArrayList<Fisch>();
		
		for (int i = 0; i < tiere.size(); i++) {
			if (tiere.get(i) instanceof Fisch) {
				fische.add((Fisch)tiere.get(i));
			}
		}
		
		return fische;
	}
	
	/**
	 * Gibt alle Säugetiere, die in der ArrayList(Tier) sind, zurück
	 * @return neue ArrayList mit allen gefundenen Säugetieren
	 */
	
	private ArrayList<Säugetier> getSäugetier () {
			
		ArrayList<Säugetier> säugetiere = new ArrayList<Säugetier>();
		
		for (int i = 0; i < tiere.size(); i++) {
			if (tiere.get(i) instanceof Säugetier) {
				säugetiere.add((Säugetier)tiere.get(i));
			}
		}
		
		return säugetiere;
	}
	
	/**
	 * Gibt alle Vögel, die in der ArrayList(Tier) sind, zurück
	 * @return neue ArrayList mit allen gefundenen Vögeln
	 */
	
	private ArrayList<Vogel> getVogel () {
		
		ArrayList<Vogel> vögel = new ArrayList<Vogel>();
		
		for (int i = 0; i < tiere.size(); i++) {
			if (tiere.get(i) instanceof Vogel) {
				vögel.add((Vogel)tiere.get(i));
			}
		}
		
		return vögel;
	}
	
	/**
	 * Wählt eine zufällige Aktion eines Tieres aus
	 * @param t  übergebener Parameter vom Typ Tier
	 */
	
	private void doAction (Tier t) {
		
		int tmp = random(5);
		
		switch (tmp) {
		
		case 0:
			
			t.makeSound();
			
			break;
			
		case 1:
			
			int tmp1 = random(tiere.size());
			
			t.greet(tiere.get(tmp1));
			
			break;
		
		case 2:
			
			t.eat(random(1000));
			
			break;
		
		case 3:
			
			t.sleep(random(10));
			
			break;
		
		case 4:
			
			if (t instanceof Hai) {
				
				ArrayList<Fisch> fische = new ArrayList<Fisch>();
				
				for (int i = 0; i < fische.size(); i++) {
					if (tiere.get(i) instanceof Fisch) {
						fische.add((Fisch)tiere.get(i));
					}
				}
				
				((Hai)t).hunt(fische.get(random(fische.size())));
				
			} else if (t instanceof Affe) {
				
				((Affe)t).climb();
				
			} else if (t instanceof Känguru) {
				
				((Känguru)t).pouch();
				
			} else if (t instanceof Taube) {
				
				((Taube)t).domplatz();
				
			} else if (t instanceof Pinguin) {
				
				((Pinguin)t).dive();
			}
			
			break;
		}
	}
	
	/**
	 * Methode um einen Zootag zu simulieren
	 * @param people  übergebener Parameter vom Typ int
	 */
	
	private void openZoo (int people) {
		
		if (people < 200) {
			
			System.out.println("Heute ist aber wenig los. Trotzdem freuen sich die Tiere auf euren Besuch! Bitte treten Sie ein!");
		
		} else if (people >= 200 && people <= 500) {
			
			System.out.println("Heute ist ein Tag mit durchschnittlich vielen Besuchern. Die Tiere freuen sich auf Ihren Besuch! Bitte treten Sie ein!");
		
		} else {
			
			System.out.println("Wir können nicht mehr viele Besucher reinlassen. Also beeilen Sie sich und sehen Sie noch heute unsere fantastischen Tiere!");
		}
		
		System.out.println("Im Zoo sind folgende Tiere zu finden:");
		
		for (int i = 0; i < tiere.size(); i++) {
			
			System.out.println(tiere.get(i).toString());
		}
		
		System.out.println();
		
		for (int i = 0; i < tiere.size(); i++) {
			
			doAction (tiere.get(i));
		}
	}
	
	/**
	 * Zufallsgenerator für Nummern
	 * @param n  Parameter der bestimmt, wie groß die max. Nummer sein darf
	 * @return zufällig ausgewählte Nummer
	 */
	
	private int random (int n) {
		
		Random random = new Random();
		
		return random.nextInt(n);
	}
	
	/**
	 * Main Methode, in der der Nutzer verschiedene Aktionen im Zoo durchführen kann
	 * @param args  Die übergebenen Befehle aus der Kommandozeile
	 */
	
	public static void main(String[] args) {
		
		Zooverwaltung z1 = new Zooverwaltung();
		
		z1.addFisch(z1.random(5));
		z1.addSäugetier(z1.random(5));
		z1.addVogel(z1.random(5));
		
		int choice = 0;
		
		Scanner eingabe = new Scanner(System.in);
		
		while (choice != 6) {
			
			System.out.println("\nWas möchten Sie tun:\n1) Alle Tiere ausgeben\n2) Alle Fische ausgeben\n3) Alle Säugetiere ausgeben\n4) Alle Vögel ausgeben\n5) Zoo Tag simulieren\n6) Exit");
			
			choice = eingabe.nextInt();
			
			switch (choice) {
			
			case 1:
				
				for (int i = 0; i < z1.tiere.size(); i++) {
					System.out.println(z1.tiere.get(i).toString());
				}
				
				break;
				
			case 2:
				
				ArrayList<Fisch> fische = z1.getFisch();
				
				for (int i = 0; i < fische.size(); i++) {
					System.out.println(fische.get(i).toString());
				}
				
				break;
				
			case 3:
				
				ArrayList<Säugetier> säugetiere = z1.getSäugetier();
				
				for (int i = 0; i < säugetiere.size(); i++) {
					System.out.println(säugetiere.get(i).toString());
				}
				
				break;
				
			case 4:
				
				ArrayList<Vogel> vögel = z1.getVogel();
				
				for (int i = 0; i < vögel.size(); i++) {
					System.out.println(vögel.get(i).toString());
				}
				
				break;
			
			case 5:
				
				z1.openZoo (z1.random(600));
				
				break;
				
			case 6:
				
				System.out.println("\nProgramm wird beendet!");
				
				break;
				
			default:
				
				System.out.println("\nFalsche Eingabe!");
				
				break;
			}
		}		
	}
}
