import by.gsu.epamlab.MaterialImpl;
import by.gsu.epamlab.Material;
import by.gsu.epamlab.MaterialEnumImpl;
import by.gsu.epamlab.Subject;

public class Runner2 {
	
	//second solution whith Enum
	public static void main(String[] args) {
		//1
		Subject subject = new Subject("wire", MaterialEnumImpl.STEEL, 0.03);
		//2
		System.out.println(subject);
		//3
		subject.setMaterial(MaterialEnumImpl.COPPER);
		System.out.println("The wire mass is "+subject.GetMass()+" kg.");
		
	
	}

}
