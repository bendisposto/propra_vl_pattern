package strategy_pattern;

public class Mitarbeiter {
	ArbeitsAnweisung anweisung;

	public Mitarbeiter(ArbeitsAnweisung anweisung) {
		this.anweisung = anweisung;
	}

	public void arbeiten() {
		anweisung.ausfuehren();
	}
}
