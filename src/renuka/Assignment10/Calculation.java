package renuka.Assignment10;

/*Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.*/

public class Calculation {
	
	int addition(int x, int y) {
		return x+y;
	}
	
	int subtraction(int x, int y) {
		return x-y;
	}
	
	int multiplication(int x, int y) {
		return x*y;
	}
	
	int division(int x, int y) {
		return x/y;
	}
	
	void printTotalAnswer(int add, int sub, int mul, int div) {
		int total = add + sub + mul + div;
		System.out.println(total);
    }
	

	public static void main(String[] args) {
		Calculation cal = new Calculation();
		int addition = cal.addition(10,20);//30
		int subtraction = cal.subtraction(25,20);//5
		int multiplication = cal.multiplication(5,2);//10
		int division = cal.division(15,5);//3
		cal.printTotalAnswer(addition, subtraction, multiplication, division);//48

	}

}
