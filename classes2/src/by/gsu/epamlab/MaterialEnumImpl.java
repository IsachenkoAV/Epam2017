package by.gsu.epamlab;

public enum MaterialEnumImpl implements Material{STEEL("Steel",7850),COPPER("Copper",8500);
	private final String name;
	private final double density;
	MaterialEnumImpl(String name, double density) {
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
