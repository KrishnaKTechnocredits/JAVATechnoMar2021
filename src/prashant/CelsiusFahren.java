package prashant;

public class CelsiusFahren {

	void temperature(double F) {
		double C = (F - 32) * 5 / 9;
		System.out.println("Celsius of 104 Fahernheit is :" + C);

	}

	public static void main(String[] args) {
		CelsiusFahren CelFahren = new CelsiusFahren();
		CelFahren.temperature(104);
	}
}
