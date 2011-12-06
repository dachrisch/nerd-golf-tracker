package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public final class ScoreCardAnzeigen implements Operation {
	
	public ScoreCardAnzeigen() {
	}
	
	public String fuehreAus(Scorecard scorecard) {
		scorecard.anzeigen();
		return "";
	}

}