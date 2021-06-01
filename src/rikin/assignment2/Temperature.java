package rikin.assignment2;
 
 class Temperature{

	void celsius(int fahrenheit){
		int ans = (fahrenheit - 32) * 5/9;
		System.out.println("Celsius is  " +ans);
	}
	
	public static void main (String [] args){
		Temperature temperature = new Temperature();
		temperature.celsius(102);
		temperature.celsius(103);
		temperature.celsius(104);
		temperature.celsius(105);
	}
}