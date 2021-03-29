package siddhant;

class Calculator{
	int x = 20;
	int y= 5;
	
	void add()
	{
		int answer = x + y;
		System.out.println("Addition of two variable is " + answer);
	}

	void sub()
	{
		int answer = x - y;
		System.out.println("Subtraction of two variable is " + answer);
	}
	
	void div()
	{
		int answer = x/y;
		System.out.println("Divsion of two variable is " + answer);
	}
	void multiplication()
	{
		int answer = x*y;
		System.out.println("Multiplication of two variable is " +answer);
	}
	public static void main(String[] a)
	{
		Calculator c1 = new Calculator(); 
		c1.add();
		c1.sub();
		c1.div();
		c1.multiplication();
	}
}