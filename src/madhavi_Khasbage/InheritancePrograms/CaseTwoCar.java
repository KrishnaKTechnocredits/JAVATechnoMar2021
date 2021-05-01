package madhavi_Khasbage.InheritancePrograms;

public class CaseTwoCar extends CaseOneVehicle {
	String steering = "Power steering";
	String musicSystem = "dulset";
	int airConditioner = 2;

	void getCarBrandSlogan() {
		System.out.println("Safety is not automatic, think about it.");
	}

	void getDetails() {
		System.out.println(
				"Steering :" + steering + "\nMusic System :" + musicSystem + "\nAir Conditioner :" + airConditioner);
	}

	public static void main(String[] args) {
		CaseTwoCar car1 = new CaseTwoCar();
		car1.getCarBrandSlogan();
		car1.getDetails();
		car1.colour = "white";
		car1.engine = "petrol";
		System.out.println("Wheel :" + car1.wheels + "\nColour :" + car1.colour + "\nEngine :" + car1.engine);
	}
}
