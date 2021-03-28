package rahul_hiremath;

class Ass_2_4
{
	void convertFahToCel(int fahrenheit){
		int Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Conversion is: " + Celsius);
	}
	public static void main (String[] args){
		Ass_2_4 Celsius = new Ass_2_4();
		Celsius.convertFahToCel(5);
	}
}