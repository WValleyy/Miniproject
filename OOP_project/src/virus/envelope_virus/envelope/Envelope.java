package virus.envelope_virus.envelope;

import java.util.ArrayList;

public class Envelope {

	private String lipidBilayer;
	
	private ArrayList<String> viralProteins;

	public Envelope(String lipidBilayer, ArrayList<String> viralProteins) {
		super();
		this.lipidBilayer = lipidBilayer;
		this.viralProteins = viralProteins;
	}
	
	public String toString() {
		return lipidBilayer + "\n" + String.join("\n", viralProteins);
	}
	
	
}
