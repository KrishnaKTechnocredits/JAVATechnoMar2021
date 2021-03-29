//WAP to convert temperature from Fahrenheit to celsius degree
//Celsius = (Fahrenheit-32)*5/9
package sangeeta;

class TempratureConvertor{
	
	void temp(int F){
		double celsius = (F-32)*5/9;
		System.out.println(" Temprature in Celsius is "+celsius);
	}
	
	public static void main(String[] a){
		TempratureConvertor tempratureConvertor = new TempratureConvertor();
		tempratureConvertor.temp(90);
	}
}