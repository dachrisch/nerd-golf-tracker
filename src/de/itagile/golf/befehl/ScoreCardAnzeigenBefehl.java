package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.ScoreCardAnzeigen;

public class ScoreCardAnzeigenBefehl implements Befehl {

	public ScoreCardAnzeigen operation() {
		return new ScoreCardAnzeigen();
	}

	public String kommando() {
		return "Zeige ScoreCard";
	}

	public String beschreibung() {
		return "dann zeige ich eine Scorecard mit der Anzahl der bisherigen Schläge pro Loch";
	}

}
