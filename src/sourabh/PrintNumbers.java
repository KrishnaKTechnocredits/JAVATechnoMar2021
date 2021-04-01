package sourabh;

public class PrintNumbers {
	void printalleven(int startNumber, int endNumber) {
		System.out.println("***********Print all even numbers***************");
		while (startNumber <= endNumber) {
			if(startNumber %2==0)
				System.out.println(startNumber);			
			startNumber++;			
		}
	} 
	void printDivisibleBy5(int startNumber, int endNumber) {
		System.out.println("*********Print all numbers which is divisible by 5************");
		while (startNumber <= endNumber) {
			if(startNumber %5==0)
				System.out.println(startNumber);			
			startNumber++;			
		}		
	}
	void printDivisibleBy5And3(int startNumber, int endNumber) {
		System.out.println("***************Print all numbers which is divisible by 5 and divisible by 3*********");
		while (startNumber <= endNumber) {
			if(startNumber %5==0 && startNumber %3==0)
				System.out.println(startNumber);			
			startNumber++;			
		}		
	}
	void printDivisibleBy7Or13(int startNumber, int endNumber) {
		System.out.println("****************Print all numbers which is divisible by 7 or 13*******************");
		while (startNumber <= endNumber) {
			if(startNumber %7==0)
				System.out.println(startNumber+" is divisible by 7");
			else if(startNumber %13==0)
				System.out.println(startNumber+" is divisible by 13");
			startNumber++;			
		}		
	}	
	public static void main(String[] args) {
		PrintNumbers printNumbers= new PrintNumbers();
		printNumbers.printalleven(10, 15);
		printNumbers.printDivisibleBy5(10, 30);
		printNumbers.printDivisibleBy5And3(5, 18);
		printNumbers.printDivisibleBy7Or13(5, 40);
	}
}
