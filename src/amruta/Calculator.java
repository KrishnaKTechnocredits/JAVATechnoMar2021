package amruta;

class Calculator
{
	int x = 20;
	int y = 5;
	int answer;
	
	void Add()
	{
	 answer = x+y;
	System.out.println("Addition of two Variable is :"+answer);
	}	
	void Sub()
	{
	 answer = x-y;
	System.out.println("Substraction of two Variable is :"+answer);
	}	
	void Mul()
	{
	answer = x*y;
	System.out.println("Multiplication of two Variable is :"+answer);
	}	
	void Div()
	{
	 answer = x/y;
	System.out.println("Division of two Variable is :"+answer);
	}
	
	public static void main(String [] a)
	{
	Calculator Cal1 = new Calculator();
	Cal1.Add();
	Cal1.Sub();
	Cal1.Mul();
	Cal1.Div();
	}
}



/* class Calculator
{
	int x = 20;
	int y = 5;
	
	//int x , y = 20, 5;
	
	void Add()
	{
	int answer = x+y;
	System.out.println("Addition of two Variable is :"+answer);
	}	
	void Sub()
	{
	int answer = x-y;
	System.out.println("Substraction of two Variable is :"+answer);
	}	
	void Mul()
	{
	int answer = x*y;
	System.out.println("Multiplication of two Variable is :"+answer);
	}	
	void Div()
	{
	int answer = x/y;
	System.out.println("Division of two Variable is :"+answer);
	}
	
	public static void main(String [] a)
	{
	Calculator Cal1 = new Calculator();
	Cal1.Add();
	Cal1.Sub();
	Cal1.Mul();
	Cal1.Div();
	}
} */

// O/P = 25 15 100 4
