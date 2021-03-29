package milind;
/*Add,sub,mul,div operation perform
 * 
 */
class Example3{
	int x=20;
	int y=5;
	
	void add()
	{
		int answer=x + y;
		System.out.println("Addition of two variable is "+answer);
	}
	void sub()
	{
		int answer=x - y;
		System.out.println("Subtraction of two variable is "+answer);
	}
	void mul()
	{
		int answer=x * y;
		System.out.println("Multiplication of two variable is "+answer);
	}
	void div()
	{
		int answer=x / y;
		System.out.println("Division of two variable is "+answer);
	}
	public static void main(String[] args)
	{
		Example3 calculator1 = new Example3();
		calculator1.add();
		calculator1.sub();
		calculator1.mul();
		calculator1.sub();
		}
		

}