package parakh;

public class ConvertTemperature{

      void convertTempFahrenheitToCelsius(double temp){
           System.out.println("Temperature in celcius is: " +((temp - 32) * 5 / 9)); 
      }

      public static void main(String args[]){
	  ConvertTemperature convertTemperature = new ConvertTemperature();
	  convertTemperature.convertTempFahrenheitToCelsius(98.5);
	  }
}
	  