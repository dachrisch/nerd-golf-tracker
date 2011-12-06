package de.itagile.golf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Startausgabe;

public class Main {
	
	static {
		System.setProperty("file.encoding", "UTF-8");
	}
	
	public static void main(String[] args) throws IOException {
		Startausgabe startoperation = new Startausgabe(new Lochausgabe());
		Tracker tracker = new Tracker(new EinfacherInterpreter(), startoperation);
		gibtAus(tracker.starte());
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String befehl = reader.readLine();
			gibtAus(tracker.reagiereAuf(befehl));
		}
	}

	private static void gibtAus(String ausgabe) {
		System.out.println(ausgabe);
		System.out.print("Bitte Befehl eingeben: ");
	}
}