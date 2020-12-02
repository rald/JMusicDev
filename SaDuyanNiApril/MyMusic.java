import jm.JMC;
import jm.constants.*;
import jm.music.data.*;
import jm.util.*;

public final class MyMusic implements JMC {
	public static void main(String[] args){

		final double LEGATO = 0.95;

		Note[] notes0 = {

			new Note(G4,QN),
			new Note(G4,QN),
			new Note(G4,QN),
			new Note(G4,QN),
			new Note(G4,QN),
			new Note(F4,HN),
			new Note(G4,QN),
			new Note(B4,QN),
			new Note(G4,QN),
			new Note(F4,QN),
			new Note(F4,QN),
			new Note(E4,QN),
			new Note(REST,HN),

			new Note(E4,QN),
			new Note(E4,QN),
			new Note(E4,QN),
			new Note(E4,QN),
			new Note(E4,QN),
			new Note(D4,HN),
			new Note(E4,QN),
			new Note(F4,QN),
			new Note(E4,QN),
			new Note(D4,QN),
			new Note(D4,QN),
			new Note(C4,HN),
			new Note(REST,HN),

			new Note(G4,QN),
			new Note(G4,QN),
			new Note(G4,QN),
			new Note(G4,QN),
			new Note(G4,QN),
			new Note(F4,HN),
			new Note(G4,QN),
			new Note(B4,QN),
			new Note(G4,QN),
			new Note(F4,QN),
			new Note(G4,QN),
			new Note(F4,QN),
			new Note(E4,QN),
			new Note(G4,QN),
			new Note(REST,HN),

			new Note(F4,QN),
			new Note(A4,QN),
			new Note(G4,QN),
			new Note(F4,QN),
			new Note(E4,QN*LEGATO),
			new Note(F4,QN*LEGATO),
			new Note(G4,QN),
			new Note(C4,QN),
			new Note(D4,QN),
			new Note(E4,QN),
			new Note(F4,QN),
			new Note(E4,QN),
			new Note(D4,QN),
			new Note(D4,QN*LEGATO),
			new Note(C4,QN*LEGATO),
			new Note(REST,HN),

		};

		Note[] notes1 = {

			new Note(C4,QN),
			new Note(D4,QN),
			new Note(E4,QN),
			new Note(F4,QN),
			new Note(G4,QN),
			new Note(G4,QN),
			new Note(REST,QN),
			new Note(GS4,QN),
			new Note(AS4,HN),
			new Note(CS5,HN),
			new Note(C5,QN),
			new Note(AS4,QN),
			new Note(G4,HN),
			new Note(REST,HN),

			new Note(C4,QN),
			new Note(D4,QN),
			new Note(E4,QN),
			new Note(F4,QN),
			new Note(G4,HN),
			new Note(G4,HN),
			new Note(REST,QN),
			new Note(GS4,QN),
			new Note(AS4,HN),
			new Note(CS5,HN),
			new Note(C5,QN),
			new Note(AS4,QN),
			new Note(GS4,HN),
			new Note(REST,HN),

			new Note(G4,QN),
			new Note(C5,QN),
			new Note(AS4,QN),
			new Note(GS4,QN),
			new Note(G4,HN),
			new Note(G4,HN),
			new Note(REST,QN),
			new Note(G4,QN),
			new Note(AS4,QN),
			new Note(GS4,QN),
			new Note(G4,QN),
			new Note(F4,HN),
			new Note(REST,HN),

			new Note(F4,QN),
			new Note(A4,QN),
			new Note(G4,QN),
			new Note(F4,QN),
			new Note(E4,HN*LEGATO),
			new Note(G4,HN*LEGATO),
			new Note(REST,QN),
			new Note(C4,QN),
			new Note(D4,QN),
			new Note(E4,QN),
			new Note(F4,QN),
			new Note(E4,HN),
			new Note(D4,QN),
			new Note(D4,HN),
			new Note(C4,HN),
			new Note(REST,HN),

			
		};

		Phrase phrase0 = new Phrase(notes0);
		Phrase phrase1 = new Phrase(notes0);
		Phrase phrase2 = new Phrase(notes1);
		Phrase phrase3 = new Phrase(notes0);
		Phrase phrase4 = new Phrase(notes1);
		Phrase phrase5 = new Phrase(notes0);
		Part part = new Part(MUSIC_BOX);
		part.addPhrase(phrase0);
		part.addPhrase(phrase1);
		part.addPhrase(phrase2);
		part.addPhrase(phrase3);
		part.addPhrase(phrase4);
		part.addPhrase(phrase5);
		Score score = new Score("",240,part);
	
		Write.midi(score,"MyMusic.mid");
	}
}
