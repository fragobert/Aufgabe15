package zoo.aufgabe15.vogel;

public class Pinguin extends Vogel{

	/**
	 * Konstruktor für die Pinguin Klasse, speichert übergebene Parameter in Superklasse
	 * @param name	übergebener Name vom Typ String
	 */
	
	public Pinguin (String name) {
		super (name, "weiß");
	}
	
	/**
	 * Gibt String mit Informationen über Tier zurück
	 */
	
	public String toString () {
		return "Pinguin [" + super.toString() + "]";
	}
	
	/**
	 * Gibt String aus, der Geräusch des Tieres darstellen soll
	 */
	
	public void makeSound () {
		System.out.println(this + ": Peep peep!");
	}
	
	/**
	 * Gibt passenden String aus, der den Pinguin tauchen lässt
	 */
	
	public void dive () {
		System.out.println("Der Pinguin taucht ins Wasser!");
	}
	
}
