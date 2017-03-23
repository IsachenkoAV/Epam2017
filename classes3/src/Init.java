import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.WeekDay;

public class Init {
	private int PURCHASES_NUMBER;
	private String fileName;
	private BufferedReader bufReader; 
	
	public Init(String fileName)
	{
		this.fileName= fileName;
	}
	
	public Purchase[] getPurcheses() throws IOException
	{
		
		return readMassive1();
		//openFile(fileName);     //second version with BufferedReader 
		//return readMassive2(); 
	}
	
	private Purchase[] readMassive1()
	{
		Scanner sc = null;	
		try {
			sc = new Scanner(new FileReader(fileName));
			sc.useLocale(Locale.ENGLISH);		//установка локали
			String line = sc.next();
			PURCHASES_NUMBER=Integer.parseInt(line);
			//1
			Purchase[] purchases = new Purchase[PURCHASES_NUMBER];
			//2
			for(int i=0;i<PURCHASES_NUMBER;i++)
			{
								
				int number = sc.nextInt();
				double discount =sc.nextDouble();
				int dayInt =sc.nextInt();
				WeekDay day=WeekDay.values()[dayInt];
				Purchase purchase = new Purchase(number,discount,day);
				purchases[i]=purchase;
			}
			return purchases;
						
		} catch (FileNotFoundException e) {
			System.err.println("Input file is not found");
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		return null;
	}
	
	
	
	//second version with BufferedReader 
	private void openFile(String fileName)
	{
		
		File file = new File(fileName);
		BufferedReader bufReader=null;
        try {
			FileReader reader = new FileReader(file);
			bufReader = new BufferedReader(reader);
							
		} catch (FileNotFoundException e) {
			System.out.println("file "+file.getAbsolutePath()+" not found");
			System.exit(0);
		} 
        catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.bufReader=bufReader;
	}
	
	private Purchase[] readMassive2() throws IOException
	{
		String  line =bufReader.readLine();
		PURCHASES_NUMBER=Integer.parseInt(line);
		//1
		Purchase[] purchases = new Purchase[PURCHASES_NUMBER];
		//2
		for(int i=0;i<PURCHASES_NUMBER;i++)
		{
			line=bufReader.readLine();
			String[] lineSplit = line.split(" ");
			int number = Integer.parseInt(lineSplit[0]);
			double discount =Double.parseDouble(lineSplit[1]);
			int dayInt =Integer.parseInt(lineSplit[2]);
			WeekDay day=WeekDay.values()[dayInt];
			Purchase purchase = new Purchase(number,discount,day);
			purchases[i]=purchase;
		}
		
		
		return purchases;
	}

}
