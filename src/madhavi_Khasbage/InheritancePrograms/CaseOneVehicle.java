package madhavi_Khasbage.InheritancePrograms;

/*Case 1*/
public class CaseOneVehicle {
	int wheels = 4;
	String colour = "black";
	String engine = "petrol";

	void getDetails() {
		System.out.println("Wheel :" + wheels + "\nColour :" + colour + "\nEngine :" + engine);
	}

	public static void main(String[] args) {
		CaseOneVehicle vehicle1 = new CaseOneVehicle();
		vehicle1.getDetails();
		// System.out.println(vehicle1.name); [reason : class CaseOneVehicle does not
		// have variable name ]
	}
}
