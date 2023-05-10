package zoo.aufgabe15.säugetier;

public class Affe extends Säugetier{

	/**
	 * Konstruktor für die Affe Klasse, speichert übergebene Parameter in Superklasse
	 * @param name	übergebener Name vom Typ String
	 */
	
	public Affe (String name) {
		super (name, "braun");
	}
	
	/**
	 * Gibt String mit Informationen über Tier zurück
	 */
	
	public String toString () {
		return "Affe [" + super.toString() + "]";
	}
	
	/**
	 * Gibt String aus, der Geräusch des Tieres darstellen soll
	 */
	
	public void makeSound () {
		System.out.println(this + ": Uga Uga!");
	}
	
	/**
	 * Gibt passenden String aus
	 */
	
	public void climb () {
		System.out.println(this + ": Ich klettere jetzt auf einen Baum!");
	}
	
}
