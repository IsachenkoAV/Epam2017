package by.gsu.epamlab;

public class Purchase implements Comparable<Purchase> {
	public final static String COMMODITY_NAME="Bread Gomel's";
	public static int price=153;
	private int numberUnits;
	private double discountPercent;
	private final WeekDay day;
	
	public Purchase() {
		day=null;
	}

	public Purchase(int numberUnits, double discountPercent, WeekDay day) {
		super();
		this.numberUnits = numberUnits;
		this.discountPercent = discountPercent;
		this.day = day;
	}
	
	public Purchase(int number, double percent, int day) {
		this(number,percent,WeekDay.values()[day]);
		
	}


	@Override
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(numberUnits).append(";")
		.append(discountPercent).append(";")
		.append(Converter.rubleConverter(getCost())).append(";")
		.append(day.name().toLowerCase());
		
		return  info.toString();
	}

	public int getCost( ) 
	{
		int cost =  (int) Math.ceil(price*numberUnits*(100.0-discountPercent)/100.0); //round in the big side
		//int cost =   (int) Math.round(price*numberUnits*(100.0-discountPercent)/100.0); round in the lesser
																									// side
		return cost;
		
	}


	public int getNumberUnits() {
		return numberUnits;
	}

	public void setNumberUnits(int numberUnits) {
		this.numberUnits = numberUnits;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public WeekDay getDay() {
		return day;
	}
	
	@Override
	public int compareTo(Purchase o) {
		
		return this.numberUnits-o.numberUnits;
	}
	
	
	

}
