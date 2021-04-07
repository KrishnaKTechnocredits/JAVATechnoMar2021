package purva.ConnectionBetweenClasses.Assignment9;

public class Substraction {
	
	int sub(int number1, int number2) {
		int subs = 0;
		if(number1<number2) {
			System.out.println("Cant perform substraction of smaller number from bigger number");
		}
		else {
		   subs = number1 - number2;
		}
		return subs;
	}
}
