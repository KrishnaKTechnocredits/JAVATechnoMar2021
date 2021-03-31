//  Calculater
package ashwini;

class calculator
{
	int x=10;
	int y= 20;
	
	void add()
	{
		int answer = x+y;
		System.out.println("addtion of two number is:"+ answer);
	}
	void substraction()
	{
		int answer= x-y;
		System.out.println("substraction of two number is:"+ answer);
	}
	
	void multiply()
	{
		int answer = x*y;
		System.out.println("multiplication of two number is:"+ answer);
	}
	void divide()
	{
		float  answer =x/y;
		System.out.println("division of two number is:"+ answer);
	}
	public static void main(String a[])
	{
		calculator calculator1 = new calculator();
		calculator1.add();
		calculator1.substraction();
		calculator1.multiply();
		calculator1.divide();
	}
}


