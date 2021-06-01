package madhavi_Khasbage.InheritancePrograms;

/* Case five */
public class CaseFiveExample extends CaseTwoCar {

	public static void main(String[] args) {

		/*CaseTwoCar extends CaseOneVehicle*/
		/* CaseOneVehicle a1 = new CaseOneVehicle();
		CaseTwoCar b1 = new CaseTwoCar();
		a1 = b1;  OR  below Shortcut*/
		
		CaseOneVehicle a1 = new CaseTwoCar(); //Shortcut
		a1.getDetails(); 
		a1.colour = "Black";
		a1.engine = "Desile";

		// a1.steering= "electric steering"; CE [reason : class CaseOneVehicle does not
		// have variable steering ]
		// a1.getCarBrandSlogan(); CE [reason : class CaseOneVehicle does not have
		// method getCarBrandSlogan ]

		System.out.println("Colour :" + a1.colour + "\nEngine :" + a1.engine);
	}
}
