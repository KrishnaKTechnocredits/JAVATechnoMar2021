package anubhav;

class Calculator{
	int x=10;
	int y=5;
	
	void addition(){
		int answer= x+y;
		System.out.println("Addition of two variables is" + " " + answer);
	}
	
	void subtract(){
		int answer= x-y;
		System.out.println("Difference of two variables is"+ " " + answer);
	}
	
	void multiply(){
		int answer=x*y;
		System.out.println("Multiplication of two variables is" + " " + answer);
	}
	
	void divide(){
		int answer= x/y;
		System.out.println("Division of two variables is" + " " + answer);
	}
	
	public static void main (String[] args){
	Calculator calculator= new Calculator();
	calculator.addition();
	calculator.subtract();
	calculator.multiply();
	calculator.divide();
	}
} 