class Calculator
{
	int x=20;
	int y=5;
	
	void add()
	{
		int answer = x+y;
		System.out.println("Addition of two variable is" +answer);
	}
	
	void sub()
	{
		int answer = x-y;
		System.out.println("Substraction of two variable is" +answer);
		
	}
	
	void mul()
	{
		int answer = x*y;
		System.out.println("Multiplication of two variables is" +answer);
		
	}
	
	void div()
	{
		int answer = x/y;
		System.out.println("Division of two variables is" +answer);
		
		
	}
	
	 public static void main(String[] args)
	 {
		 Calculator calculator=new Calculator();
		 calculator.add(); 
		 calculator.sub();
		 calculator.mul();
		 calculator.div();
	 }
}