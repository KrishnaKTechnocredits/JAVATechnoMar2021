package kapil;

class Temperature
{
  void Convert (int fahrenheit)
  {
  
     int Celsius = (fahrenheit-32)*5/9;
	 System.out.println("Temperature in Celsius ="+Celsius);
	}
	public static void main (String[] args)
	{
	  Temperature temperature1= new Temperature();
	  temperature1.Convert(98);
	  }
	}  
	  
	  