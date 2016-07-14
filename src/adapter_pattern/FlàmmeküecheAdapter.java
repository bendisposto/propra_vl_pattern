package adapter_pattern;

import adapter_pattern.cant_touch_this.Flàmmeküeche;

public class FlàmmeküecheAdapter implements Pizza {

	private Flàmmeküeche flammkuchen;

	public FlàmmeküecheAdapter(Flàmmeküeche flammkuchen) {
		this.flammkuchen = flammkuchen;
	}

	public void beschreiben() {
		flammkuchen.décrire();
	}

}
