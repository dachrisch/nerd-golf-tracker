package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public final class ScoreCardMock implements Operation {
	
	private final Operation folgeoperation;

	public ScoreCardMock(Operation folgeoperation) {
		this.folgeoperation = folgeoperation;
	}
	
	public String fuehreAus(Scorecard scorecard) {
		return 
				"S C O R E C A R D :\n" +
				"Loch Anzahl Schläge\n" +
				" 1 \t 2 \n"+
				" 2 \t 3 ";
	}

}