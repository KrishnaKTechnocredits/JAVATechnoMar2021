/*WAP to display addition ,substraction,multiplication and division of using two variables.*/

package simmi.assignment_1_5;

public class Calculate {
	int x = 20, y=5;
	void add(){
		int answer = x+y;
		System.out.println("the addition of two variable is - "+answer);	
	}
	void sub(){
		int answer = x-y;
		System.out.println("the substraction of two variable is - "+answer);
	}
	void mul(){
		int answer = x*y;
		System.out.println("the multiplication of two variable is - "+answer);
	}
	void div(){
		int answer = x/y;
		System.out.println("the division of two variable is - "+answer);
	}
	public static void main(String []args){

		Calculate cal = new Calculate();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
}
