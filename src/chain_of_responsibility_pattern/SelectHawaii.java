package chain_of_responsibility_pattern;

import chain_of_responsibility_pattern.pizzas.Hawaii;
import chain_of_responsibility_pattern.pizzas.Pizza;

public class SelectHawaii extends Chain {

	@Override
	public Pizza compute(String selection) {
		if ("H".equals(selection))
			return new Hawaii();
		else
			return next.compute(selection);
	}

}
