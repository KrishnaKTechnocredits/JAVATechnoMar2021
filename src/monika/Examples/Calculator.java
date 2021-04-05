package monika.Examples;

//Example2
class Calculator{
	int x= 20, y = 5;
	
	void add(){
		int answer = x+y;
		System.out.println("Addition of two variable "+answer);
	}
	
	void sub(){
		int answer = x-y;
		System.out.println("Subtraction of two variable "+answer);
	}
	
		void mul(){
		int answer = x*y;
		System.out.println("Multiplication of two variable "+answer);
	}
	
	void div(){
		int answer = x/y;
		System.out.println("Division of two variable "+answer);
	}
	public static void main(String[] args){
		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}
	
}