package chain_of_responsibility_pattern;

import chain_of_responsibility_pattern.pizzas.Pizza;
import chain_of_responsibility_pattern.pizzas.Prosciutto;

public class SelectProsciutto extends Chain {

	@Override
	public Pizza compute(String selection) {
		if ("P".equals(selection))
			return new Prosciutto();
		else
			return next.compute(selection);
	}

}
