package ami;

class Calculator{
	int x = 20;
	int y = 5;
	
	void add(){
		int answer = x + y;
		System.out.println("Addition of two variable is "+ answer);
		}
		
	void sub(){
		int answer1 = x - y;
		System.out.println("Substraction of Two Variable is "+ answer1);
		}
		
	void multi(){
		int answer2 = x * y;
		System.out.println("Multiplication of two variable is " + answer2);
		}
		
	void div(){
		int answer3 = x / y;
		System.out.println("Divison of two variable is " + answer3);
		}
	
	public static void main (String[] a){;
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.multi();
		calculator.div();
	}
}