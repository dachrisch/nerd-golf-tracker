package de.itagile.golf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TrackerDriver {

	private Process process;
	private BufferedReader reader;
	private PrintWriter writer;
	private String letzteAntwort;
	private String eingabeaufforderung;
	
	public TrackerDriver() {
		process = startNerdGolfTracker();
		reader = readerFor(process);
		writer = writerFor(process);
		shutDownWhenSystemExits(process);
		speichereAntwort();
	}

	private PrintWriter writerFor(Process process) {
		return new PrintWriter(new OutputStreamWriter(process.getOutputStream()), true);
	}

	private BufferedReader readerFor(Process process) {
		return new BufferedReader(new InputStreamReader(process.getInputStream()));
	}

	private Process startNerdGolfTracker() {
		try {
			return Runtime.getRuntime().exec(
					"java -jar build/libs/nerd-golf-tracker.jar");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void shutDownWhenSystemExits(final Process process) {
		Runtime.getRuntime().addShutdownHook(new Thread(){
			@Override
			public void run() {
				process.destroy();
				super.run();
			}
		});
	}

	public void empfangeAnweisung(String anweisung) {
		writer.println(anweisung);
		speichereAntwort();
	}
	
	public String letzteAntwort() {
		return letzteAntwort;
	}
	
	public String eingabeaufforderung(){
		return eingabeaufforderung;
	}

	
	private void speichereAntwort() {
		try {
			letzteAntwort = reader.readLine();
			StringBuffer sb = new StringBuffer();
			char c = (char)reader.read();
			sb.append(c);
			while(c != ':') {
				c = (char)reader.read();
				sb.append(c);
			}
			c = (char)reader.read();
			sb.append(c);
			eingabeaufforderung = sb.toString();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}
}