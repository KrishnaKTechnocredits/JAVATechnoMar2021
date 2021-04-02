package sangeeta;

public class NumberIdentifier {
	
	void printEvenNumbers(int startIndex, int endIndex) {
		for(int index = startIndex;index <= endIndex; index++ ) {
			if(index%2 == 0) {
			int evenNumbers = index;
			System.out.println("Even Number are "+evenNumbers);
				}
		}
		
	}
	
	void divisibleBy5Number(int startIndex, int endIndex) {
		for(int index = startIndex;index <= endIndex; index++ ) {
			if(index%5 == 0) {
				int divisibleBy5 = index;
				System.out.println("Divisible by 5 Numbers are "+divisibleBy5);
				}
		
		}
	}
	
	void divisibleBy5And3Nuber(int startIndex, int endIndex) {
		for(int index = startIndex;index <= endIndex; index++ ) {
			if(index%5 == 0 && index%3 == 0) {
				int divisibleBy5and3 = index;
				System.out.println("Numbers divisible by 5 and 3 are "+divisibleBy5and3);
			}
		
		}
	}	
	void divisibleBy7Or13Number(int startIndex, int endIndex) {
		for(int index = startIndex;index <= endIndex; index++ ) {
			if(index%7 == 0 || index%13 == 0) {
				int divisibleBy7Or13 = index;
				System.out.println("Numbers divisible by 7 or 13 are "+divisibleBy7Or13);
	      }
		}
	}	
public static void main(String[] a) {
	NumberIdentifier numberIdentifier = new NumberIdentifier();
	numberIdentifier.printEvenNumbers(10,15);
	numberIdentifier.divisibleBy5Number(10,30);
	numberIdentifier.divisibleBy5And3Nuber(5,18);
	numberIdentifier.divisibleBy7Or13Number(5,40);
	
}
	

}
