package decorator_pattern;

public class NurTeig implements Pizza {

	@Override
	public String describe() {
		return "Dünner Teig";
	}

	@Override
	public double preis() {
		return 4.0;
	}

}
