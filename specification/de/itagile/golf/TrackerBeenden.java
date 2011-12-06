package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class TrackerBeenden extends BaseScenario{

	public TrackerBeenden() {
		addSteps(new TrackerBeendenSteps(new TrackerDriver()));
	}
}
