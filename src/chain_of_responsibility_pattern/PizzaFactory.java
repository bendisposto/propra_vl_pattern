package chain_of_responsibility_pattern;

import chain_of_responsibility_pattern.pizzas.Pizza;

public class PizzaFactory {

	private Chain selectionChain;

	public PizzaFactory() {
		SelectMargherita selectMargherita = new SelectMargherita();
		SelectProsciutto selectProsciutto = new SelectProsciutto();
		SelectHawaii selectHawaii = new SelectHawaii();
		SelectDefault selectDefault = new SelectDefault();
		selectionChain = selectMargherita;
		selectMargherita.setNextChain(selectHawaii);
		selectHawaii.setNextChain(selectProsciutto);
		selectProsciutto.setNextChain(selectDefault);
	}

	Pizza getPizza(String selection) {
		return selectionChain.compute(selection);
	}
}
