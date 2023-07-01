package virus.envelope_virus;

import component.Component;

public class Covid extends  EnvelopeVirus{
	
	private Component eProtein;
	
	private Component mProtein;

	public Covid(Component acidNucleic, Component capsid, Component lipidBilayer, Component glycoProtein,
			Component eProtein, Component mProtein) {
		super(acidNucleic, capsid, lipidBilayer, glycoProtein);
		this.eProtein = eProtein;
		this.mProtein = mProtein;
	}

	@Override
	public String toString() {
		return super.toString()  + "eProtein = " + eProtein + ", mProtein=" + mProtein + "]";
	}
	
	
	
	

	
	
	


		

	
	

}
