package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Alias;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class ScoreCardAnzeigenSteps extends BaseSteps {

	public ScoreCardAnzeigenSteps(TrackerDriver driver) {
		super(driver);
	}
	
	@When("ich den ScoreCard-Befehl aufrufe,")
	public void rufeHilfeAuf() {
		empfangeAnweisung("Zeige ScoreCard");
	}
	
	@Then("zeigt der NerdGolfTracker die ScoreCard an")
	public void zeigtScoreCardAn() {		
		assertThatAntwort(containsString("S C O R E C A R D :"));
		assertThatNaechsteAntwort(containsString("Loch"));
		assertThatAntwort(containsString("Anzahl Schläge"));
	}
	
	@Then("listet \"$schlaege\" Schläge für Loch \"$loch\"")
	@Alias("listet \"$schlaege\" Schläge für Loch \"$loch\".")
	public void zeigtDieAnzahlSchlaegeProLochAn(String schlaege, String loch) {
		assertThatNaechsteAntwort(containsString(String.format("%s \t %s", loch, schlaege)));
	}
	
}