package de.itagile.golf;

import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class UnbekannteEingabeSteps extends BaseSteps {

	public UnbekannteEingabeSteps(TrackerDriver driver) {
		super(driver);
	}

	@When("ich eine dem NerdGolfTracker unbekannte Eingabe mache,")
	public void unbekanntesKommand() {
		empfangeAnweisung("foobar");
	}

}
