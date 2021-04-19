package krati_Jain;

class Assignment8NumbersWhile {
	
	void evenNumbers(int startNum1, int endNum1) {
		int totalCount = 1;
		System.out.println("Even Numbers are:");
				while(totalCount <= endNum1) {
					if ((startNum1%2) == 0) {
						System.out.println(startNum1);
						totalCount++;
					} 
				startNum1++;
		}
		
	}
	
	void divisibleBy5(int startNum2, int endNum2) {
		int totalCount = 1;
		System.out.println("\nDivisible by 5, numbers are:");
		while(totalCount <= endNum2) { //Range -> 10 to 15
			if((startNum2%5) == 0) {
				System.out.println(startNum2);
				totalCount++;
			}
			startNum2++;
		}
		
	}
	
	void divisibleBy5And3(int startNum3, int endNum3) {
		int totalCount = 1;
		System.out.println("\nDivisible by 5 & 3, numbers are:");
		while(totalCount <= endNum3) {
			if ((startNum3%3 == 0) && (startNum3%5 ==0)) {
				System.out.println(startNum3);
				totalCount++;
			}
			startNum3++;
			}
	}
	
	void divisibleBy7Or13(int startNum4, int endNum4) {
		int totalCount = 1;
		System.out.println("\nDivisible by 7 or 13, numbers are:");
		while(totalCount <= endNum4) {
			if ((startNum4%7 == 0) || (startNum4%13 ==0)) {
				if (startNum4%7 == 0)
					System.out.println(startNum4 + " is divisible by 7");
				else
					System.out.println(startNum4 + " is divisible by 13");
				totalCount++;
			}
			startNum4++;
			}
	}
	
	public static void main(String[] a) {
		Assignment8NumbersWhile assignment8NumbersWhile = new Assignment8NumbersWhile();
		assignment8NumbersWhile.evenNumbers(1, 5);
		assignment8NumbersWhile.divisibleBy5(1,3);
		assignment8NumbersWhile.divisibleBy5And3(1,7);
		assignment8NumbersWhile.divisibleBy7Or13(1,8);
	}
}
