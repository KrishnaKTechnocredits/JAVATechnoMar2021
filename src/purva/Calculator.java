/*
 * WAP called calculator, which has4 methods.
add, sub,mul , div
2 instance variable, x=20 and y=5
1 local variable answer and print the answe in every individual method
*/
package purva;

class Calculator{
	int x = 20;
	int y = 5;
	
	void add(){
		int answer = x + y;
		System.out.println("Addition of twonumber is:"+answer);
	}
	
	void sub(){
		int answer = x - y;
		System.out.println("Substraction of two variable is:"+answer);
	}
	
	void div(){
		int answer = x/y;
		System.out.println("division of two varible is:"+answer);
	}
	
	void multi(){
		int answer = x*y;
		System.out.println("multiplaction of two variable is:"+answer);
	}
	
	public static void main(String[] args){
		Calculator calci= new Calculator();
		calci.add();
		calci.sub();
		calci.div();
		calci.multi();
	}
}