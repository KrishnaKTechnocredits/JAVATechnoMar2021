package ashish_Vyas;

public class MathematicsOperations {
	
	//1. On user define range print all even numbers.
	void findEvenNumber(int startNumber, int stopNumber) {
		System.out.println("Even numbers from "+startNumber+" to "+stopNumber+" are: ");
		for (int i=startNumber; i<=stopNumber; i++) {
			if (i%2 ==0) {
				System.out.println(i);
			}
		}
	}
	//2. On user define range print all numbers which is divisible by 5.
	void findDivisibleBy5(int startNumber, int stopNumber) {
		System.out.println("Numbers divisible from "+startNumber+" to "+stopNumber+"By 5 : ");
		for (int i=startNumber; i<=stopNumber; i++) {
			if (i%5 ==0) {
				System.out.println(i+" ");
			}
		}
	}
	//3. On user define range print all numbers which is divisible by 5 and divisible by 3.
	void findDivisibleBy5and3(int startNumber, int stopNumber) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		for (int i=startNumber; i<=stopNumber; i++) {
			if (i%5 ==0 && i%3 ==0) {
				System.out.println(i);
			}
		}
	}
	//4. On user define range print all numbers which is divisible by 7 or 13.
	void findDivisibleBy7and13(int startNumber, int stopNumber) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		for (int i=startNumber; i<=stopNumber; i++) {
			if (i%7 ==0) {
				System.out.println(i+" is divisible by 7");
			}else if (i%13 ==0) {
				System.out.println(i+" is divisible by 13");
			}
		}
	}
	//main method
	public static void main(String[] arg) {
		MathematicsOperations mathematicsOperations = new MathematicsOperations();
		mathematicsOperations.findEvenNumber(2, 15);
		mathematicsOperations.findDivisibleBy5(10, 30);
		mathematicsOperations.findDivisibleBy5and3(10, 18);
		mathematicsOperations.findDivisibleBy7and13(4, 40);
	}
	

}
