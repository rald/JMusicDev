import jm.JMC;
import jm.music.data.*;
import jm.util.*;

public final class MyMusic implements JMC {
	public static void main(String[] args){
		Note note = new Note(C4,MINIM);
		Phrase phrase = new Phrase(note);
		Part part = new Part(phrase);
		Score score = new Score(part);
		Write.midi(score,"MyMusic.mid");
	}
}
