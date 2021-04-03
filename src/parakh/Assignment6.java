package parakh;

public class Assignment6 {

	void isEven(int evenstart, int evenend) {
		System.out.println("All EVEN numbers between"+ evenstart+" n "+evenend);
		for(int i=evenstart; i<evenend; i++) 
			if(i%2 == 0)
				System.out.println(i);
	}

	void isDivisibleby5(int divisor5start, int divisor5end ) {
		System.out.println("All numbers divisible by 5 are "+ divisor5start+" n "+divisor5end);
		for(int i=divisor5start; i<divisor5end; i++) 
			if(i%5==0)
				System.out.println(i);
	}

	void isDivisibleby5n3(int divisorstart, int divisorend) {
		System.out.println("All numbers divisible by 5 and 3 are"+ divisorstart+" n "+divisorend);
		for(int i=divisorstart; i<divisorend; i++) 
			if(i%3==0 && i%5==0)
				System.out.println(i);
	}

	void isDivisibleby7or13(int divisorstart, int divisorend) {
		System.out.println("All numbers divisible by 7 or 13 are "+ divisorstart+" n "+divisorend);
		for(int i=divisorstart; i<divisorend; i++) 
			if(i%7==0 || i%13==0)
				System.out.println(i);
	}

	public static void main(String[] args) {
		Assignment6 assignment6=new Assignment6();
		assignment6.isEven(10,15);
		assignment6.isDivisibleby5(10,35);
		assignment6.isDivisibleby5n3(5,18);
		assignment6.isDivisibleby7or13(5,40);
	}
}