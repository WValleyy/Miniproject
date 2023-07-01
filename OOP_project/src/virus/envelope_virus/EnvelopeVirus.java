package virus.envelope_virus;

import virus.Virus;
import virus.envelope_virus.envelope.Envelope;

public class EnvelopeVirus extends Virus {
	
	private Envelope envelope;

	public EnvelopeVirus(String acidNucleic, String capsid, Envelope envelope) {
		super(acidNucleic, capsid);
		// TODO Auto-generated constructor stub
		this. envelope = envelope;
	}
	
	public String toString() {
		return (super.toString() + envelope + "\n"  );
	}
	
}


