package madhavi_Khasbage.InheritancePrograms;

public class CaseThreeDynamicPoly extends CaseTwoCar {

	public static void main(String[] args) {
		CaseOneVehicle vehicle = new CaseTwoCar();

		vehicle.getDetails(); /*
								 * getDetails() method exist in CaseOneVehicle & CaseTwoCar class but at runtime
								 * it will call CaseTwoCar's getDetails method
								 */

		vehicle.colour = "white";
		vehicle.engine = "petrol";

		// vehicle.steering= "Power steering"; CE [reason : class CaseOneVehicle does
		// not have variable steering ]
		// vehicle.getCarBrandSlogan(); CE [reason : class CaseOneVehicle does not have
		// method getCarBrandSlogan ]

		System.out.println("Colour :" + vehicle.colour + "\nEngine :" + vehicle.engine);
	}
}
