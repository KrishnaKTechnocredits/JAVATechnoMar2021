/* 
 * Assignment 2 covert temperature from celsius to farenheit
 */
package purva;

class Temperature{
    
	void conversion(int farenheit){
	   int celsius =(farenheit - 32)*5/9;
	   System.out.println("Temperature in celsius is:"+celsius);
	}
	   
	public static void main(String[] args){
	   Temperature temperature = new Temperature();
	   temperature.conversion(300);
	}
	   
}
	