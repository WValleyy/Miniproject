package virus;



public abstract class Virus  {
   
    private String acidNucleic;
    private String capsid;
	public Virus(String acidNucleic, String capsid) {
		super();
		this.acidNucleic = acidNucleic;
		this.capsid = capsid;
	}
	
	public String toString() {
		return (acidNucleic + "\n" + capsid + "\n");
	}
	
}


        


