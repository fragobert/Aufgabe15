package zoo.aufgabe15.fisch;

import java.util.Random;

public class Hai extends Fisch{

	/**
	 * Konstruktor für die Hai Klasse, speichert übergebene Parameter in Superklasse
	 * @param name	übergebener Name vom Typ String
	 */
	
	public Hai (String name) {
		super(name, "blau");
	}
	
	/**
	 * Gibt String mit Informationen über Tier zurück
	 */
	
	public String toString () {
		return "Hai [" + super.toString() + "]";
	}

	/**
	 * Jagt übergebenen Fisch, 50 prozentige Chance für den Fisch gefressen zu werden
	 * @param f	Übergebener Fisch
	 */
	
	public void hunt (Fisch f) {
		System.out.println(f + " wird jetzt gejagt!");

		Random random = new Random();
		
		if (random.nextInt(2) + 1 == 1) {
			System.out.println("Der Fisch wurde gefressen!");
		} else {
			System.out.println("Der Fisch ist entkommen!");
		}
	}
	
}
