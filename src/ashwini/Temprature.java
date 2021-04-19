//WAP to conver celcius into fahrenheit.

package ashwini;

class Temprature{
	double fahrenheit, celcius;
	
	void temprature(double c){
		celcius = c;
		fahrenheit = ((c*9)/5)+32;
		System.out.println("Temprature in fahrenheit is :"+ fahrenheit);
	}
	public static void main(String args[]){
		Temprature temprature1 = new Temprature();
		temprature1.temprature(13);
	}
}