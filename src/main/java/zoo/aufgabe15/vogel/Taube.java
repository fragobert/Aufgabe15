package zoo.aufgabe15.vogel;

public class Taube extends Vogel {
	
	/**
	 * Konstruktor für die Taube Klasse, speichert übergebene Parameter in Superklasse
	 * @param name	übergebener Name vom Typ String
	 */
	
	public Taube (String name) {
		super (name, "grau");
	}
	
	/**
	 * Gibt String mit Informationen über Tier zurück
	 */
	
	public String toString () {
		return "Taube [" + super.toString() + "]";
	}
	
	/**
	 * Gibt String aus, der Geräusch des Tieres darstellen soll
	 */
	
	public void makeSound () {
		System.out.println(this + ": Gurr Gurr!");
	}
	
	/**
	 * Gibt String aus, der besagt, was die Taube normalerweise auf dem Domplatz treibt
	 */
	
	public void domplatz () {
		System.out.println("Die Taube hat gerade dein Eis gestohlen!");
	}
	
}
