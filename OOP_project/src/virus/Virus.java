package virus;

import component.Component;

public abstract class Virus  {
   
    private Component acidNucleic;
    private Component capsid;
	public Virus(Component acidNucleic, Component capsid) {
		super();
		this.acidNucleic = acidNucleic;
		this.capsid = capsid;
	}
	
	public String toString() {
		return (acidNucleic + "\n" + capsid + "\n");
	}
	
}


        


