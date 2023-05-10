package zoo;

public abstract class Tier {

	private final String name, color;
	
	/**
	 * Konstruktor für die Tier Klasse, speichert übergebene Parameter in lokale Variablen
	 * @param name	übergebener Name vom Typ String
	 * @param color	übergebene Farbe vom Typ String
	 */
	
	protected Tier (String name, String color) {
		
		this.name = name;
		this.color = color;
		
	}
	
	public abstract void makeSound ();
	
	public abstract void greet (Tier t);
	
	public abstract void eat (int gramm);
	
	/**
	 * Gibt passenden String aus
	 * @param hours	Wie viele Stunden geschlafen werden soll
	 */
	
	final public void sleep (int hours) {
		System.out.println(this + ": Ich schlafe jetzt " + hours + "Stunden!");
	}

	/**
	 * Gibt den Namen zurück
	 * @return	Name
	 */
	
	public String getName () {
		return this.name;
	}
	
	/**
	 * Gibt die Farbe zurück
	 * @return	Farbe
	 */
	
	public String getColor () {
		return this.color;
	}

	/**
	 * Gibt String mit Namen und Farbe zurück
	 */
	
	public String toString () {
		return getName() + " - " +  getColor();
	}
	
}
