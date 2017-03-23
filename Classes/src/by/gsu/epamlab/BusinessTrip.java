package by.gsu.epamlab;

public class BusinessTrip {
	private final static int DAILY_ALLOWANCE=110; 
	private String account; 
	private int transportExpenses;
	private int numberOfDays; 
	
	public BusinessTrip()
	{
		super();
	}
	
	public BusinessTrip(String account, int transportExpenses, int numberOfDays)
	{
		this.account=account;
		this.transportExpenses = transportExpenses;
		this.numberOfDays = numberOfDays;
	}
	
	
	public void show()
	{
		StringBuilder showInfo = new StringBuilder();
		showInfo.append("Rate = ")
		.append(rubleConverter(DAILY_ALLOWANCE)).append("\n")
		.append("Account = ")
		.append(account).append("\n")
		.append("transport = ")
		.append(rubleConverter(transportExpenses)).append("\n")
		.append("days = ").append(numberOfDays).append("\n")
		.append("total = ")
		.append(rubleConverter(getTotal ())).append("\n");
		System.out.println(showInfo);
	}
	
	@Override
	public String toString() {
		StringBuilder InfoCsv = new StringBuilder();
		InfoCsv.append(account).append(";").append(transportExpenses).append(";")
		.append(numberOfDays).append(";").append(getTotal ());
		return InfoCsv.toString();
	}
	
	public int getTotal ()
	{
		
		int total= transportExpenses+numberOfDays*DAILY_ALLOWANCE;
		return total;
	}
	
	public static String rubleConverter (int kopeck) // Converts kopecks into rubles
	{
		int tempRubles = kopeck/100;
		int tempKopecks = kopeck%100;
		StringBuilder ansver = new StringBuilder();
		ansver.append(tempRubles).append(".").append(tempKopecks);
		return ansver.toString();
	}
	

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getTransportExpenses() {
		return transportExpenses;
	}

	public void setTransportExpenses(int transportExpenses) {
		this.transportExpenses = transportExpenses;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

}
