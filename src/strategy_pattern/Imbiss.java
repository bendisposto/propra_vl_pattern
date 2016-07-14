package strategy_pattern;

public class Imbiss {
	public static void main(String[] args) {
		Mitarbeiter caaaarl = new Mitarbeiter(new HofFegen());
		Mitarbeiter alfredo = new Mitarbeiter(new PizzaBacken());
		Mitarbeiter charles = new Mitarbeiter(new PommesFritieren());

		caaaarl.arbeiten();
		alfredo.arbeiten();
		charles.arbeiten();
		caaaarl.arbeiten();
	}
}
