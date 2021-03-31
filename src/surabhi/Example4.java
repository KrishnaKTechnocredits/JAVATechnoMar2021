package surabhi;
/*
 * 
 * Assignment num 2
 * */
class Example4{

	void convertToCelcius(int fahrenheit){
	double celcius=(fahrenheit - 32) * 5 / 9;
	System.out.println("Celcius is " +celcius);
	}

	public static void main(String args[]){
	Example4 exm4=new Example4();
	exm4.convertToCelcius(45);
	}
}