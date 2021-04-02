package krati_Shukla;

class Calculator 
{
	int x = 20;
	int y = 5;
	
	void add ()
	{
		int a = x+y;
		System.out.println("addition is"+a);
	}
	
	void subs ()
	{
		int b = x-y;
		System.out.println ("Substraction is"+b);
	}
	
	void mul ()
	{
		int c = x*y;
		System.out.println ("Multiplication is"+c);
	}
	
	void Div ()
	{
		int d = x/y;
		System.out.println ("Division is"+d);
	}
	
	public static void main (String[] a)
	{
		Calculator Calculator = new Calculator();
		Calculator.add();
		Calculator.subs();
		Calculator.mul();
		Calculator.Div();
	}
}
		
		