package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class DefaultVerhalten extends BaseScenario {
	
	public DefaultVerhalten() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new DefaultVerhaltenSteps(driver),
				 new SchlaegeZaehlenSteps(driver));
	}

}
