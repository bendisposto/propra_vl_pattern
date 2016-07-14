package strategy_pattern;

public class PizzaBacken implements ArbeitsAnweisung {

	@Override
	public void ausfuehren() {
		System.out.println("Pizza backen");
	}

}
