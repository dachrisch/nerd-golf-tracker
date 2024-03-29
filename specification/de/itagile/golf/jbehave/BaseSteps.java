package de.itagile.golf.jbehave;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matcher;
import org.jbehave.scenario.steps.Steps;

import de.itagile.golf.ProcessStatus;
import de.itagile.golf.TrackerDriver;

public abstract class BaseSteps extends Steps {

	private final TrackerDriver driver;

	public BaseSteps(TrackerDriver driver) {
		super(ScenarioConfiguration.KEYWORDS);

		this.driver = driver;
	}

	public void empfangeAnweisung(String anweisung) {
		driver.empfangeAnweisung(anweisung);
	}

	public void assertThatAntwort(Matcher<String> matcher) {
		assertThat(driver.letzteAntwort(), matcher);
	}
	
	public void assertThatNaechsteAntwort(Matcher<String> matcher) {
		driver.speichereAntwort();
		assertThatAntwort(matcher);
	}


	public void assertThatEingabeaufforderung(Matcher<String> matcher) {
		empfangeAnweisung("dummy read");
		assertThat(driver.eingabeaufforderung(), matcher);
	}

	public void assertThatTrackerStatus(Matcher<ProcessStatus> matcher) {
		assertThat(driver.returnStatus(), matcher);
	}
}
