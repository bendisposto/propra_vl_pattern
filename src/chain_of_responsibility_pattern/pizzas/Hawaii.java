package chain_of_responsibility_pattern.pizzas;

public class Hawaii implements Pizza {

	@Override
	public void describe() {
		System.out.println("Pizza mit Schinken und Ananas");
	}

}
