import by.gsu.epamlab.MaterialImpl;
import by.gsu.epamlab.Subject;

public class Runner {

	public static void main(String[] args) {
		//1
		Subject subject = new Subject("wire", new MaterialImpl("Steel",7850), 0.03);
		//2
		System.out.println(subject);
		//3
		subject.setMaterial(new MaterialImpl("copper", 8500));
		System.out.println("The wire mass is "+subject.GetMass()+" kg.");
		
	
	}

}
