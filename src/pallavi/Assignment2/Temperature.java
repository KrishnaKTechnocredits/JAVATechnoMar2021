package pallavi.Assignment2;

class Temperature{
	float celsius;
	int fahrenheit;
	
	void convert(int f){
	celsius= ((f - 32) * 5 )/ 9;
	System.out.println(celsius);
	}
	
	public static void main(String args[]){
	Temperature temperature = new Temperature();
	temperature.convert(40);
	}
}	 