package krati_Jain;

class Assignment6Numbers {
	int number1;
	int number2;
	int number3;
	int number4;
	
	void evenNumbers() {
		//if ((num1 < 10) || (num1 > 15))
			//System.out.println("Provided input number is not in the defined range i.e. 10 t0 30");
		//else {
		System.out.println("Even Numbers are:");
		for(int number1 = 10; number1 <=15 ; number1++ ) { //Range -> 10 to 15
			if((number1%2) == 0)
				System.out.println(number1);
			}
		}
	
	void divisibleBy5() {
		System.out.println("Divisible by 5, numbers are:");
		for(int number2 = 10; number2 <=30; number2++ ) { //Range -> 10 to 15
			if((number2%5) == 0)
				System.out.println(number2);
		}
	}
	
	void divisibleBy5And3() {
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int number3 = 5; number3 <=18; number3++ ) { //Range -> 5 to 18
			if((number3%5) == 0 && (number3%3) == 0)
				System.out.println(number3);
		}
	}
	
	void divisibleBy7Or13() {
		System.out.println("Divisible by 7 or 13, numbers are:");
		for(int number4 = 5; number4 <=40; number4++ ) { //Range -> 5 to 40
			if((number4%7) == 0 || (number4%13) == 0) {
				if ((number4%7) == 0)
				System.out.println(number4 + " is divisible by 7");
				else
				System.out.println(number4 + " is divisible by 13");
				}
		}
	}
	
	public static void main(String[] a) {
		Assignment6Numbers assignment6Numbers = new Assignment6Numbers();
		assignment6Numbers.evenNumbers();
		assignment6Numbers.divisibleBy5();
		assignment6Numbers.divisibleBy5And3();
		assignment6Numbers.divisibleBy7Or13();
	}
}