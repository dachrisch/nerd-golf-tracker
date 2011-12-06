package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class ScoreCardAnzeigen extends BaseScenario {

	public ScoreCardAnzeigen() {

		TrackerDriver driver = new TrackerDriver();
		addSteps(new BallSchlagenSteps(driver), new ZumNaechstenLochGehenSteps(
				driver), new ScoreCardAnzeigenSteps(driver));
	}
}