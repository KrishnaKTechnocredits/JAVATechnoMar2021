package shivani.shivani_Assignment_2;

class TempConvert {

	void tempConverter(double fahrenheit) {
		double celsius = ((fahrenheit - 32) * 5 / 9);
		System.out.println("Temp in celsisus is =" + celsius);
	}

	public static void main(String[] args) {
		TempConvert converter = new TempConvert();
		converter.tempConverter(5);
	}
}
