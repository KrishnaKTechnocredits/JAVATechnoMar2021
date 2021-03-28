package priyanka_Panat;
/*
 Assignment 1
 */
class Calculator{
    int x=20;
	int y=5;
	
	void add(){
		int answer=x+y;
		System.out.println("Addition of 2 variable is " + answer);
    }
	
	void sub(){
		int answer=x-y;
		 System.out.println("Subtraction of 2 variable is " + answer);
	}
	
	void mul(){
		 int answer=x*y;
		 System.out.println("Multiplication of 2 variable is "+ answer);
	}
	
	void div(){
		int answer=x/y;
		System.out.println("Division of 2 variable is "+ answer);
	}
	public static void main(String[] args){
		Calculator c1= new Calculator();
	     c1.add();
		 c1.sub();
		 c1.mul();
		 c1.div();
	}
}