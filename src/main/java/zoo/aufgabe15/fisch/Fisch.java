package zoo.aufgabe15.fisch;
import zoo.aufgabe15.Tier;

public abstract class Fisch extends Tier {

	/**
	 * Konstruktor für die Fisch Klasse, speichert übergebene Parameter in Superklasse
	 * @param name	übergebener Name vom Typ String
	 * @param color	übergebene Farbe vom Typ String
	 */
	
	protected Fisch (String name, String color) {
		super (name, color);
	}
	
	/**
	 * Gibt String aus, der Geräusch des Tieres darstellen soll
	 */
	
	final public void makeSound () {
		System.out.println(this + ": Glup!");
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
		return "Fisch [" + super.toString() + "]";
	}
	
	/**
	 * Gibt passenden String aus
	 */
	
	public void swim () {
		System.out.println(this + " schwimmt vor sich hin!");
	}
	
}
