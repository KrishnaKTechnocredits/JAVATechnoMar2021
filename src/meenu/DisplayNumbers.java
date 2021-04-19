package meenu;

public class DisplayNumbers {
	
	void evenNumbers(int startNumber, int endNumber){
		System.out.println("Even numbers are: ");
		for(int i=startNumber;i<=endNumber;i++) {
			if(i%2==0)
				System.out.println(i);										
		}
	}
	
	void divisibleBy5(int startNumber,int endNumber) {
		System.out.println("Numbers divisible by 5 are:");
		for(int i=startNumber;i<=endNumber;i++) {
			if(i%5==0)
				System.out.println(i);
		}
	}
	
	void divisibleBy5And3(int startNumber,int endNumber) {
		System.out.println("Numbers divisible by 5 and 3 are:");
		for (int i=startNumber;i<=endNumber;i++) {
			if(i%5==0 && i%3==0)
				System.out.println(i);				
		}
	}
	
	void divisibleBy7And13(int startNumber,int endNumber) {
		System.out.println("Number divisible by 7 or 13 are:");
		for(int i=startNumber;i<=endNumber;i++) {
				if(i%7==0)
				  System.out.println(i+" is divisible by 7");
				else if(i%13==0)
				  System.out.println(i+" is divisible by 13");
		}
	}
	
	public static void main(String[] args) {
		DisplayNumbers displayNumbers = new DisplayNumbers();
		displayNumbers.evenNumbers(10,15 );
		displayNumbers.divisibleBy5(10,30);
		displayNumbers.divisibleBy5And3(5,18);
		displayNumbers.divisibleBy7And13(5,40);		
	}

}
