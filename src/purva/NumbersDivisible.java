package purva;

public class NumbersDivisible {

	void evenNumber() {
		System.out.println("Even numbers from 1 to 15 are :");
		for(int number=10;number<=15;number++) 
			if(number%2 ==0)
				System.out.println(number);
	}
	
	void fiveDivisible() {
		System.out.println("Number divisible by 5 are :");
		for(int number=10;number<=30;number++)
			if(number%5==0)
				System.out.println(number);
		        
	}
	
	void fiveAndThree() {
		System.out.println("Number divisible by 5 and 3 are :");
		for(int number=5;number<=18;number++)
			if(number%5==0 && number%3==0)
				System.out.println(number);
	}
	
	void sevenOrThirteen() {
		System.out.println("Divisible by 7 or 13, numbers are :");
		for(int number=5;number<=40;number++)
			if(number%7==0)
				System.out.println(number +" is divisible by 7");
			else if(number%13==0) 
				System.out.println(number +" is divisible by 13");
	}
	
	public static void main(String[] a){
		NumbersDivisible numbersDivisible = new NumbersDivisible();
		numbersDivisible.evenNumber();
	    numbersDivisible.fiveDivisible();
	    numbersDivisible.fiveAndThree();
	    numbersDivisible.sevenOrThirteen();
	}
}

