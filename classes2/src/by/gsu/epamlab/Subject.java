package by.gsu.epamlab;

public class Subject {
	private String name;
	private Material material;
	private double volume;
	
	public Subject() {
		super();
		
	}

	public Subject(String name, Material material, double volume) {
		super();
		this.name = name;
		this.material = material;
		this.volume = volume;
	}
	
	
	public  double GetMass ()
	{
		return material.getDensity()*volume;
		
	}
	
	@Override
	public String toString() {
		StringBuilder infoCsv = new StringBuilder();
		infoCsv.append(name).append(";").append(material).append(";").append(volume) 
		.append(";").append(this.GetMass());
		return infoCsv.toString();
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
		
}
