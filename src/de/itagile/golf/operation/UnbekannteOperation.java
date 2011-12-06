package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class UnbekannteOperation implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) {
		return "Gib einen gültigen Befehl ein. \"Hilfe\" zeigt mögliche Befehle an.";
	}

}
