package by.gsu.epamlab;

import java.text.NumberFormat;

public class Converter {
	public static String rubleConverter (int kopeck) // Converts kopecks into rubles
	{
		int tempRubles = kopeck/100;
		int tempKopecks = kopeck%100;
		StringBuilder ansver = new StringBuilder();
		ansver.append(tempRubles).append(".").append(tempKopecks);
		return ansver.toString();
	}
	
	public static double rubleConverter (double kopeck) // Converts kopecks into rubles
	{
		
		return kopeck/100;
	}
	
	public static int roundByRubleLowerSide(int kopecks)
	{
		return Math.round((kopecks/100))*100;
	}
	
	
	public static String numberFormat(Double value, int fraction)
	{
		NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(fraction);
        return nf.format(value);
	}

}
