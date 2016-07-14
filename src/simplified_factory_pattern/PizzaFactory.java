package simplified_factory_pattern;

public class PizzaFactory {
	Pizza getPizza(String selection) {
		switch (selection) {
		case "M":
			return new Margherita();
		case "H":
			return new Hawaii();
		case "P":
			return new Prosciutto();
		default:
			return null;
		}
	}
}
