package aashay;

class Calculator
{
	int x = 20;
	int y = 5;
	
	//Addition method
	void addition()
	{
		int answer = x + y;
		System.out.println("Addition of X & Y is: "+ answer);
	}
	//Subtraction method
	void subtraction()
	{
		int answer = x - y;
		System.out.println("Subtraction of X & Y is: "+ answer);
	}
	//Mulitplication method
	void multiplication()
	{
		int answer = x * y;
		System.out.println("Multiplication of X & Y is: "+ answer);
	}
	//Division method
	void division()
	{
		int answer = x / y;
		System.out.println("Division of X & Y is: "+ answer);
	}
	
	public static void main(String [] args)
	{
		Calculator cal = new Calculator();
		cal.addition();
		cal.subtraction();
		cal.multiplication();
		cal.division();
		
	}
	
}