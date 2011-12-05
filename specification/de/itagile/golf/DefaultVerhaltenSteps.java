package de.itagile.golf;


import org.jbehave.scenario.annotations.Aliases;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class DefaultVerhaltenSteps extends BaseSteps {

    public DefaultVerhaltenSteps(TrackerDriver driver) {
		super(driver);
	}

	@When("ich eine leere Eingabe nur mit Enter mache,")
    @Aliases(values = {
    		"ich eine leere Eingabe nur mit Leerzeichen und Enter mache,"  
    })
    public void schlageBall() {
        empfangeAnweisung("");
    }
    
}
