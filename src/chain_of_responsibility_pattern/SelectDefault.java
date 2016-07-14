package chain_of_responsibility_pattern;

import chain_of_responsibility_pattern.pizzas.Pizza;

public class SelectDefault extends Chain {

	@Override
	public Pizza compute(String selection) {
		return null;
	}

}
