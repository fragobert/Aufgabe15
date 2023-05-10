package zoo.aufgabe15.säugetier;

public class Känguru extends Säugetier{

	/**
	 * Konstruktor für die Känguru Klasse, speichert übergebene Parameter in Superklasse
	 * @param name	übergebener Name vom Typ String
	 */
	
	public Känguru (String name) {
		super (name, "braun");
	}
	
	/**
	 * Gibt String mit Informationen über Tier zurück
	 */
	
	public String toString () {
		return "Känguru [" + super.toString() + "]";
	}
	
	/**
	 * Gibt String aus, der Geräusch des Tieres darstellen soll
	 */
	
	public void makeSound () {
		System.out.println(this + ": Yipe, yipe!");
	}
	
	/**
	 * Gibt String aus, der beschreibt, was im Beutel des Kängurus zu finden ist
	 */
	
	public void pouch () {
		System.out.println(this + ": Das Känguru hat ein kleines Känguru im Beutel!");
	}
	
}
