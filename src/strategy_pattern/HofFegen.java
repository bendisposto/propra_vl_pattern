package strategy_pattern;

public class HofFegen implements ArbeitsAnweisung {

	@Override
	public void ausfuehren() {
		System.out.println("Hof fegen");
	}

}
