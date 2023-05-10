package zoo.aufgabe15.vogel;
import zoo.aufgabe15.Tier;

public abstract class Vogel extends Tier {

	/**
	 * Konstruktor für die Vogel Klasse, speichert übergebene Parameter in Superklasse
	 * @param name	übergebener Name vom Typ String
	 * @param color	übergebene Farbe vom Typ String
	 */
	
	protected Vogel (String name, String color) {
		super (name, color);
	}
	
	/**
	 * Gibt String aus, der Geräusch des Tieres darstellen soll
	 */

	public void makeSound () {
		System.out.println(this + ": Chip Chip!");
	}
	
	/**
	 * Grüßt übergebenes Tier
	 * @param t	Tier, das gegrüßt werden soll
	 */
	
	public void greet (Tier t) {
		System.out.println(this + ": Hallo, " + t);
	}
	
	/**
	 * Gibt einen String aus, der angibt, wie viel das Tier jetzt isst
	 * @param gramm	Die Menge, die gegessen wird
	 */
	
	public void eat (int gramm) {
		System.out.println(this + ": Ich esse jetzt " + gramm + "g Nahrung!");
	}
	
	/**
	 * Gibt String mit Informationen über Tier zurück
	 */
	
	public String toString () {
		return "Säugetier [" + super.toString() + "]";
	}
	
}
