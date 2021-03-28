package prachi;

//Assignment2_Program_4
//4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
// Celsius = (fahrenheit - 32) * 5 / 9

class ConvertTemperature{
	int fahrenheit = 100;
	int x =32;
	int y = 5;
	int z= 9;


void FaraToCelc(int num1, int num2, int num3, int num4){
	double FaraToCelc = (fahrenheit - 32) * 5 / 9;
	System.out.println("Conversion of Temperature is: "+FaraToCelc);
	
}
public static void main(String[] args){
		ConvertTemperature ct = new ConvertTemperature();
		ct.FaraToCelc(100, 32, 5, 9);
	}
}

