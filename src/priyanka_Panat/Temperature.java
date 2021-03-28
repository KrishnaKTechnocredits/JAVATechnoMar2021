package priyanka_Panat;

/*
 Assignment 2
 */

class Temperature{
	void temp(int f){
		int celcius=(f-32)*5/9;
		System.out.println("Temperature from Fahrenheit to Celcius is "+ celcius);
	}
	public static void main(String[] args){
		Temperature t1=new Temperature();
		t1.temp(20);
	}
}