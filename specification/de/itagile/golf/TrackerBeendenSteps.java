package de.itagile.golf;

import static org.hamcrest.CoreMatchers.is;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class TrackerBeendenSteps extends BaseSteps {

	public TrackerBeendenSteps(TrackerDriver driver) {
		super(driver);
	}

	@When("der Tracker gestartet ist")
	public void starte() {
		// nil
	}

	@When("ich das Kommando \"$kommando\" eingebe")
	public void eingabe(String kommando) {
		empfangeAnweisung(kommando);
	}

	@Then("beendet sich der Tracker")
	public void isBeendet() {
		assertThatTrackerStatus(is(ProcessStatus.TERMINATED));
	}

}
