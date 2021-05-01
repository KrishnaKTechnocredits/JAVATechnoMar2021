package madhavi_Khasbage.InheritancePrograms;

/* Case six */

public class CaseSixExample extends CaseTwoCar {
	public static void main(String[] args) {
		CaseOneVehicle a1 = new CaseOneVehicle();
		CaseOneVehicle b1 = new CaseTwoCar();
		b1 = a1;	// or  CaseOneVehicle b1= new CaseOneVehicle();
		b1.colour="Blue";
		b1.engine="desile";
		b1.wheels=6;
		
		// b1.steering="power"; CE [reason : steering variable not exist in class CaseOneVehicle, this is same like case one ]
	}
}
