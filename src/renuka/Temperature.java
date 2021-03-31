/*Assignment-2 :Write a java programto convert temperature from fahrenheit to celcius degree*/

package renuka;

class Temperature{
    
	void convertToCelcius(float Fahrenheit){
	    float celcius = ((Fahrenheit-32)*5/9);
		System.out.println("Temperature in celcius is: " +celcius);
	}
	
	public static void main(String[] args){
	    Temperature temperature = new Temperature();
		temperature.convertToCelcius(150);
	}
}