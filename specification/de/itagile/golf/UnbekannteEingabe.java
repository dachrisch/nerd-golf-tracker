package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class UnbekannteEingabe extends BaseScenario {

	public UnbekannteEingabe() {
		init();
	}

	private void init() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new UnbekannteEingabeSteps(driver), new HinweisAufHilfeSteps(driver));
	}
}
