/*Assignment no 2*/

package pravin;

class Calculator{
	int x=20;
	int y=5;


	void add(){
		int answer=x+y;
		System.out.println("Additiion:"+answer);

	}	

	void sub(){
		int answer=x-y;
		System.out.println("Substraction:"+answer);

	}

	void div(){
		int answer=x/y;
		System.out.println("Division:"+answer);
	}

	void multiplication(){
		int answer=x*y;
		System.out.println("Multiplication:"+answer);
	}


	public static void main (String[] arg ){

		Calculator calculator= new Calculator();

		calculator.add();
		calculator.sub();
		calculator.div();
		calculator.multiplication();

	}
}
