package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;
import de.itagile.golf.operation.EndeOperation;

public class EndeBefehl implements Befehl {

	@Override
	public String kommando() {
		return "Ende";
	}

	@Override
	public Operation operation() {
		return new EndeOperation();
	}

	@Override
	public String beschreibung() {
		return "dann beende ich die Anwendung";
	}
	

}
