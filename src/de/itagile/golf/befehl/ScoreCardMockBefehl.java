package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.Schlagzahlausgabe;
import de.itagile.golf.operation.ScoreCardMock;

public class ScoreCardMockBefehl implements Befehl {

	public ScoreCardMock operation() {
		return new ScoreCardMock(null);
	}

	public String kommando() {
		return "Zeige ScoreCard";
	}

	public String beschreibung() {
		return "zeigt der NerdGolfTracker die ScoreCard an";
	}

}
