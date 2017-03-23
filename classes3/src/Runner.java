import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;

import by.gsu.epamlab.Converter;
import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.WeekDay;

public class Runner {
	
		
		
	public static void main(String[] args) throws IOException {
		//1,2 Create an array for PURCHASES_NUMBER objects, Initialize this array by the file data.
			Init initial = new Init("src/in1.txt");
			Purchase[] purchases = initial.getPurcheses();
		/* 3 Print the array content to the console 
			(constants one time at first even for an array of zero length).*/
			showPurchase(purchases);
			
						
		/*4  Calculate the mean cost of all purchases (3 digits after point),
			the total cost of all purchases on Monday, the day with 
			the maximum cost purchase. Print them to console.*/
			double meanCost=0.0;
			double summCost=0.0;
			int summCostMonday=0;
			Purchase purchaseMax=null;
			int maxCost=0;
			for(Purchase purchase: purchases)
			{
				int currentCost=purchase.getCost();
				if(purchase.getDay()==WeekDay.values()[1])
				{
					summCostMonday+=currentCost;
				}
				
				if(currentCost>maxCost)
				{
					maxCost= currentCost;
					purchaseMax=purchase;
				}
				
				summCost+=currentCost;
			}
			
			if(purchases.length!=0){
			meanCost=summCost/purchases.length;
			}
			
			StringBuilder info = new StringBuilder();
			info.append("the mean cost of all purchases = ")
			.append(Converter.numberFormat(Converter.rubleConverter(meanCost),3))
			.append("\n")
			.append("total cost of all purchases on Monday = ")
			.append(Converter.rubleConverter(summCostMonday)).append("\n")
			.append("day with the maximum cost purchase is ")
			.append(purchaseMax).append("\n");
			System.out.println(info);
			
			/*5 Sort an array by the field number in ascending order by
			the method sort( ) of the class Arrays. */
			Arrays.sort(purchases);
			/*6 Print the array content to the console 
			(constants one time at first).*/
			showPurchase(purchases);
			
		/*7	Find some purchase with number equaled to 5 by the 
			method binarySearch( ) of the class Arrays and print it.*/
			int numberPurchased=5;
			int i =Arrays.binarySearch(purchases, new Purchase (numberPurchased,0,null));
			if (i>=0)
			{
				System.out.println("Purchase with number equaled to "+ numberPurchased+" is: "+purchases[i]);
			}
			else
			{
				System.out.println("Purchase with number equaled to "+ numberPurchased+" is not found");	
			}
			
			
	}
	
	private static void showPurchase(Purchase[] purchases)
	{
		StringBuilder info = new StringBuilder();
		info.append("commodity name: ")
		.append(Purchase.COMMODITY_NAME).append("\n")
		.append("Price: ")
		.append(Converter.rubleConverter(Purchase.price))
		.append("\n");
		for(Purchase purchase: purchases){
			info.append(purchase).append("\n");
		}
		System.out.println(info);
	}
		
}



