package ashish_Vyas;

public class MathematicsOperationsWhileLoop {
	
	//1. On user define range print all even numbers.
	void findEvenNumber(int startNumber, int stopNumber) {
		System.out.println("Even numbers from "+startNumber+" to "+stopNumber+" are: ");
		int i=startNumber;
		while ( i<=stopNumber) {
			if (i%2 ==0) {
				System.out.println(i);	
			}
			i++;
		}
	}
	//2. On user define range print all numbers which is divisible by 5.
	void findDivisibleBy5(int startNumber, int stopNumber) {
		System.out.println("Numbers divisible from "+startNumber+" to "+stopNumber+"By 5 : ");
		int i=startNumber; 
		while (i<=stopNumber) {
			if (i%5 ==0) {
				System.out.println(i+" ");	 
			}
			i++;
		}
	}
	//3. On user define range print all numbers which is divisible by 5 and divisible by 3.
	void findDivisibleBy5and3(int startNumber, int stopNumber) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		int i=startNumber;
		while (i<=stopNumber ) {
			if (i%5 ==0 && i%3 ==0) {
				System.out.println(i);
			}
			i++;
		}
	}
	//4. On user define range print all numbers which is divisible by 7 or 13.
	void findDivisibleBy7and13(int startNumber, int stopNumber) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		int i=startNumber;
		while ( i<=stopNumber ) {
			if (i%7 ==0) {
				System.out.println(i+" is divisible by 7");
				
			}else if (i%13 ==0) {
				System.out.println(i+" is divisible by 13");
			}
			i++;
		}
	}
	//main method
	public static void main(String[] arg) {
		MathematicsOperationsWhileLoop mathematicsOperationsWhileLoop = new MathematicsOperationsWhileLoop();
		mathematicsOperationsWhileLoop.findEvenNumber(2, 15);
		mathematicsOperationsWhileLoop.findDivisibleBy5(10, 30);
		mathematicsOperationsWhileLoop.findDivisibleBy5and3(10, 18);
		mathematicsOperationsWhileLoop.findDivisibleBy7and13(4, 40);
	}
}
