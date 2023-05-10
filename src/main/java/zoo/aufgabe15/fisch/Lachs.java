package zoo.aufgabe15.fisch;
import zoo.aufgabe15.Tier;

public class Lachs extends Fisch{
	
	/**
	 * Konstruktor für die Lachs Klasse, speichert übergebene Parameter in Superklasse
	 * @param name	übergebener Name vom Typ String
	 */
	
	public Lachs (String name) {
		super(name, "grau");
	}
	
	/**
	 * Gibt String mit Informationen über Tier zurück
	 */
	
	public String toString () {
		return "Lachs [" + super.toString() + "]";
	}
	
	/**
	 * Kontrolliert, ob übergebenes Tier ein Hai ist und gibt basierend auf dem Ergebnis der Abfrage einen passenden String aus
	 * @param t	Tier, das gegrüßt werden soll
	 */
	
	public void greet (Tier t) {
		if (t.getName().equals("Hai")) {
			System.out.println(this + " schwimmt um sein Leben!");
		} else {
			super.greet(t);
		}
	}	
}
