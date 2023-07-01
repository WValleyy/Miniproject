package component;

public class Component {
	private String name;
	private String structure;
	private String function;
	
	public Component(String name, String structure, String function) {
		super();
		this.name = name;
		this.structure = structure;
		this.function = function;
	}

	@Override
	public String toString() {
		return "Name : " + name + "\n" + "Structure : " + structure  
				+ "\n" + "Function : " + function +"\n";
	}


	
	
	
	
	
	
	
	
	
	
	
}
