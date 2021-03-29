package sai;

class Temperature{

	void temperature(float farenheit){
		float celsius = (farenheit-32)*5/9;
		System.out.println("Farenheit to Celsius conversion is " + celsius);
	}
	
	public static void main(String[] args){
		Temperature temp = new Temperature();
		temp.temperature(75.5f);
	}
}