package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.Schlagzahlausgabe;

public class DefaultBefehl implements Befehl {

	public Schlag operation() {
		return new Schlag(new Schlagzahlausgabe(new Lochausgabe()));
	}

	public String kommando() {
		return "";
	}

	public String beschreibung() {
		return "dann zähle ich mit";
	}

}
