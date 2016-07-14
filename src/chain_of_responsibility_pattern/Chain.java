package chain_of_responsibility_pattern;

import chain_of_responsibility_pattern.pizzas.Pizza;

public abstract class Chain {

	protected Chain next;

	public void setNextChain(Chain next) {
		this.next = next;
	}

	public abstract Pizza compute(String selection);

}
