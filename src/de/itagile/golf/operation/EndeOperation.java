package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class EndeOperation implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) {
		System.exit(0);
		return null;
	}

}
