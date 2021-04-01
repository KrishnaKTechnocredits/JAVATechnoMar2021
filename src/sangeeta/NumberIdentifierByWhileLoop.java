package sangeeta;

public class NumberIdentifierByWhileLoop {
	
	void printEvenNumbers(int startIndex, int endIndex) {
		int index = startIndex;
		while(index <= endIndex) {
			if(index%2 == 0) {
			int evenNumbers = index;
			System.out.println("Even Numbers are "+evenNumbers);
			
				}
			index++;
		}
		
	}
	
	void divisibleBy5Number(int startIndex, int endIndex) {
		while(startIndex <= endIndex) {
			if(startIndex%5 == 0) {
				int divisibleBy5 = startIndex;
				System.out.println("Divisible by 5 Numbers are "+divisibleBy5);
				
				}
			startIndex++;
		
		}
	}
	
	void divisibleBy5And3Nuber(int startIndex, int endIndex) {
		while(startIndex <= endIndex) {
			if(startIndex%5 == 0 && startIndex%3 == 0) {
				int divisibleBy5and3 = startIndex;
				System.out.println("Numbers divisible by 5 and 3 are "+divisibleBy5and3);
				
			}
			startIndex++;
		
		}
	}	
	void divisibleBy7Or13Number(int startIndex, int endIndex) {
		while(startIndex <= endIndex) {
			if(startIndex%7 == 0 || startIndex%13 == 0) {
				int divisibleBy7Or13 = startIndex;
				System.out.println("Numbers divisible by 7 or 13 are "+divisibleBy7Or13);
				 
	      }
			startIndex++;
		}
	}	
public static void main(String[] a) {
	NumberIdentifierByWhileLoop numberIdentifierByWhileLoop = new NumberIdentifierByWhileLoop();
	numberIdentifierByWhileLoop.printEvenNumbers(10,15);
	numberIdentifierByWhileLoop.divisibleBy5Number(10,30);
	numberIdentifierByWhileLoop.divisibleBy5And3Nuber(5,18);
	numberIdentifierByWhileLoop.divisibleBy7Or13Number(5,40);
	
}
	

}
