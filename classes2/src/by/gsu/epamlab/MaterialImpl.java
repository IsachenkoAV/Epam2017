package by.gsu.epamlab;

public class MaterialImpl implements Material {
	private final String name;
	private final double density;
	
	
	public MaterialImpl() {
		name="adamant";
		density=0;
	}


	public MaterialImpl(String name, double density) {
		super();
		this.name = name;
		this.density = density;
	}


	public String getName() {
		return name;
	}

	public double getDensity() {
		return density;
	}

	
	@Override
	public String toString() {
		StringBuilder infoCsv = new StringBuilder();
		infoCsv.append(name).append(";").append(density);
		return infoCsv.toString();
	
	}
	
	

}
