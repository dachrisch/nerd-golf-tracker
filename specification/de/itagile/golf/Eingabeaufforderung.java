package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class Eingabeaufforderung extends BaseScenario {

	public Eingabeaufforderung() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new EingabeaufforderungAnzeigenSteps(driver));
	}
}
