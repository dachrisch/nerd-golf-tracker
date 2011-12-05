package de.itagile.golf;

import java.util.HashMap;
import java.util.Map;

import de.itagile.golf.operation.UnbekannteOperation;

public class EinfacherInterpreter implements Interpreter {

	private Map<String, Operation> operationen = new HashMap<String, Operation>();

	public EinfacherInterpreter() {
		for (Befehl befehl : new Sammler<Befehl>(Befehl.class).sammle()) {
			operationen.put(befehl.kommando(), befehl.operation());
		}
	}

	@Override
	public Operation interpretiere(String string) {
		Operation operation = operationen.get(string);
		if (null == operation) {
			return new UnbekannteOperation();
		}
		return operation;
	}
}
