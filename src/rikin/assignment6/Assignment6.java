package rikin.assignment6;

public class Assignment6 {
	
	void printEvenNumber(int startLimit, int endLimit) {
		System.out.println("Even numbers are: ");
		for(int index= startLimit; index <=endLimit; index++) {
			if(index %2 ==0)
				System.out.println(index);
		}
	}
	void printDivisibleNumbers(int startLimit, int endLimit) {
		System.out.println("Divisible by 5, numbers are: ");
		for(int index= startLimit; index <=endLimit; index++) {
			if(index %5 ==0)
				System.out.println(index);
		}
	}
	void printNumbersDivisibleby5And3 (int startLimit, int endLimit) {
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for(int index= startLimit; index <=endLimit; index++) {
			if(index %5 ==0 && index %3 ==0 )
				System.out.println(index);
		}
	}
	void printNumbersDivisibleby7Or13 (int startLimit, int endLimit) {
		System.out.println("Divisible by 7 Or 13, numbers are: ");
		for(int index= startLimit; index <=endLimit; index++) {
			if(index %7 ==0 || index %13 ==0 )
				if(index %7 ==0)
					System.out.println(index + " divisible by 7 ");
				else
					System.out.println(index + " divisible by 13 ");
		}
	}
	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.printEvenNumber(10,15);
		assignment6.printDivisibleNumbers(10,30);
		assignment6.printNumbersDivisibleby5And3(5,18);
		assignment6.printNumbersDivisibleby7Or13(5,40);
		
	}
}