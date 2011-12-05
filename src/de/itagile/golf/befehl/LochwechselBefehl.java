package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Lochwechselausgabe;

public class LochwechselBefehl implements Befehl {

	public Lochwechsel operation() {
		return new Lochwechsel(new Lochwechselausgabe(new Lochausgabe()));
	}

	public String kommando() {
		return "N�chstes Loch";
	}

	public String beschreibung() {
		return "dann z�hle ich f�r das n�chste Loch mit";
	}

}
