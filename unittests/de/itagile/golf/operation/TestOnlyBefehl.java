package de.itagile.golf.operation;

import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;

public class TestOnlyBefehl implements Befehl {
	@Override
	public Operation operation() {
		return null;
	}
	
	@Override
	public String kommando() {
		return "Kommando";
	}
	
	@Override
	public String beschreibung() {
		return "Beschreibung";
	}
}
