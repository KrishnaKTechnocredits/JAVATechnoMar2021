package dipali;

public class ConvertTempToCelcius{
	double celsius;
	
	public void convertTempFromFahToCel(int fahrenheit){
		celsius =(fahrenheit-32)*5/9;
		System.out.println("Converted temprature from ["+fahrenheit+"] fahrenheit to ["+celsius+"] celsius");
	}
	
	public static void main(String []args){
		ConvertTempToCelcius temp=new ConvertTempToCelcius();
		temp.convertTempFromFahToCel(56);	
	}
}