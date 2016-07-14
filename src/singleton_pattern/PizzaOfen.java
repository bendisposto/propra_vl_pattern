package singleton_pattern;

public class PizzaOfen {

	private static final PizzaOfen instance = new PizzaOfen();
	private int temperatur;

	private PizzaOfen() {
		// no constructor for you!
	}

	public void setTemperatur(int temperatur) {
		this.temperatur = temperatur;
		System.out.println("Ofen ist auf "+temperatur+ " Grad.");
	}

	public static PizzaOfen getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		PizzaOfen o1 = PizzaOfen.getInstance();
		PizzaOfen o2 = PizzaOfen.getInstance();
		o1.setTemperatur(200);
		o1.setTemperatur(220);
		o1.setTemperatur(180);
		System.out.println(o1 == o2);
	}

}
