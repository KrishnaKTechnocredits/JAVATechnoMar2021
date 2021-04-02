package rashmi;


public class Number {
	
	
	void evenNumber(int startLimit, int endLimit) {
		
		System.out.println("even numbers are : ");
		
		for(int i = startLimit; i<=endLimit;i++) {
					if(i%2 == 0) {
					System.out.println(i);
						
				}
		}
	}
		
		
		void divby5(int startLimit, int endLimit) {
			
			System.out.println("Numbers divisible by 5 are : ");
			
			for(int i = startLimit; i<=endLimit;i++) {
						if(i%5 == 0) {
						System.out.println(i);
							
					}
			}
		}
		
		void divby5and3(int startLimit, int endLimit) {
		
		System.out.println("NUmbers divisible by both 5 and 3 are : ");
		for(int i= startLimit; i<=endLimit; i++) {
			if(i%5 == 0 && i%3 == 0) {
				
				System.out.println(i);
			}
		}
	}

	
	void divby7or13(int startLimit, int endLimit) {
	
	System.out.println("NUmbers divisible by both 7 or 13 are : ");
	for(int i= startLimit; i<=endLimit; i++) {
		if(i%7 == 0 || i%13 == 0) {
			
			System.out.println(i);
		}
	}
}

public static void main(String[] args) {
	Number number = new Number();
	number.evenNumber(2, 10);
	number.divby5(5, 20);
	number.divby5and3(1, 15);
	number.divby7or13(11, 60);
}
}