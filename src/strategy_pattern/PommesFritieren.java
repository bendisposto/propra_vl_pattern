package strategy_pattern;

public class PommesFritieren implements ArbeitsAnweisung {

	@Override
	public void ausfuehren() {
		System.out.println("Pommes fritieren");
	}

}
