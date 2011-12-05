package de.itagile.golf;

import static org.hamcrest.CoreMatchers.is;

import org.jbehave.scenario.annotations.Then;

import de.itagile.golf.jbehave.BaseSteps;

public class HinweisAufHilfeSteps extends BaseSteps {

	public HinweisAufHilfeSteps(TrackerDriver driver) {
		super(driver);
	}

	@Then("weist mich der Tracker auf die Hilfe hin.")
	public void hilfeHinweis() {
		assertThatAntwort(is("Gib einen gültigen Befehl ein. \"Hilfe\" zeigt mögliche Befehle an."));
	}
}
