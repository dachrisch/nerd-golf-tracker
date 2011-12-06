package de.itagile.golf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class EinfacheScorecard implements Scorecard {

	private int aktuellesLoch = 1;
	private int anzahlSchlaege;
	private List scoreCard = new ArrayList();

	public void anzeigen() {
		StringBuffer scoreCardOutput = new StringBuffer();
		scoreCardOutput.append("S C O R E C A R D : \n Loch \t Anzahl Schläge \n");

		Iterator it = scoreCard.iterator();
		int maxLochNummer = scoreCard.size();
		int lochNummer = 1;
		while (it.hasNext()) {
			int score = ((Integer) it.next()).intValue();
			scoreCardOutput.append(" " + lochNummer + " \t ");
			scoreCardOutput.append(score);
			if (lochNummer != maxLochNummer) scoreCardOutput.append(" \n");
			lochNummer++;
		}
		String s = scoreCardOutput.toString();
		s.substring(0, s.length() - 1);
		System.out.println(s);
		
	}

	public void erhoeheAnzahlSchlaege() {
		anzahlSchlaege++;
		if 	(scoreCard != null && scoreCard.size() > 0) {
			scoreCard.remove(scoreCard.size() -1);
		} 
		scoreCard.add(anzahlSchlaege);
	}

	public void schliesseLochAb() {
		scoreCard.add(anzahlSchlaege);
		anzahlSchlaege = 0;
		aktuellesLoch++;
	}

	public int anzahlSchlaege() {
		return anzahlSchlaege;
	}

	public int aktuellesLoch() {
		return aktuellesLoch;
	}
	
	public List getScoreCard() {
		return scoreCard;
	}
}
