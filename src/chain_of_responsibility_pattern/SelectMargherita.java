package chain_of_responsibility_pattern;

import chain_of_responsibility_pattern.pizzas.Margherita;
import chain_of_responsibility_pattern.pizzas.Pizza;

public class SelectMargherita extends Chain {

	@Override
	public Pizza compute(String selection) {
		if ("M".equals(selection))
			return new Margherita();
		else
			return next.compute(selection);
	}

}
