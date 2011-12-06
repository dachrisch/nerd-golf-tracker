package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Aliases;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class EingabeaufforderungAnzeigenSteps extends BaseSteps {
	
	public EingabeaufforderungAnzeigenSteps(TrackerDriver driver) {
		super(driver);
	}
	
	@When("ich eine Eingabe machen kann,")
	public void starteNerdGolfTracker() {
	}
	
	@Then("zeige Eingabeaufforderung.")
		
	public void zeigtEingabeaufforderung() {
		assertThatEingabeaufforderung(containsString("Bitte Befehl eingeben: "));
	}
}
