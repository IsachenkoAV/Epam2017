import by.gsu.epamlab.BusinessTrip;

public class Runner {

	public static void main(String[] args) {
	
		//1
		BusinessTrip[] businessTrips= {
		new BusinessTrip("Vania", 15,5),
		new BusinessTrip("Petia", 20, 10),
		null,
		new BusinessTrip("Zoe", 150, 124),
		new BusinessTrip()
		} ;
		
		//2
		for(BusinessTrip businessTrip: businessTrips)
		{
			if(businessTrip!=null)
			{
			businessTrip.show();
			}
		}
		
		//3
		
		businessTrips[businessTrips.length-1].setTransportExpenses(112);
		//4
		System.out.println("Duration ="+(businessTrips[0].getNumberOfDays()+businessTrips[1].getNumberOfDays())+"\n");
		//4'
		//System.out.println(totalDuration(businessTrips[0],businessTrips[1]));
		
		
		
		//5
		for(BusinessTrip businessTrip: businessTrips)
		{
			System.out.println(businessTrip);
		}
		
				

	}
	
	/*
	static String totalDuration(BusinessTrip...businessTrip)
	{
		int days=0;
		StringBuilder totalDuration = new StringBuilder();
		for(BusinessTrip i:businessTrip)
		{
			days+=i.getNumberOfDays();
		}
		totalDuration.append("Duration =").append(days);
		
		return totalDuration.toString();
		
	}*/

}
