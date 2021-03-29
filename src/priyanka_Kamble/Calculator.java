package priyanka_Kamble;

//WAP Calulator
class Calculator{
	int X=20,Y=5;
	
	void add(){
		int Ans=X+Y;
		System.out.println("Addition = " +Ans);
	}
	
	void Sub(){
		int Ans=X-Y;
		System.out.println("Substraction = " +Ans);
	}
	
	void Mul(){
		int Ans=X*Y;
		System.out.println("Multiplication = " +Ans);
	}
	
	void Div(){
		int Ans=X/Y;
		System.out.println("Division = " +Ans);
	}
	
	public static void main(String a[]){	
		Calculator c = new Calculator();
		c.add();
		c.Sub();
		c.Mul();
		c.Div();
	}
}