package virus.envelope_virus;

import component.Component;
import virus.Virus;

public class EnvelopeVirus extends Virus {
	
	private Component lipidBilayer;
	
	private Component glycoProtein;

	public EnvelopeVirus(Component acidNucleic, Component capsid, Component lipidBilayer, Component glycoProtein) {
		super(acidNucleic, capsid);
		// TODO Auto-generated constructor stub
		this.lipidBilayer =lipidBilayer;
		this.glycoProtein = glycoProtein;
	}
	
	public String toString() {
		return (super.toString() + lipidBilayer + "\n" + glycoProtein + "\n"   );
	}
	
}


