package aashay;

public class NumberRange {
	int start, index;
	
	void printAllEven(int strt, int idx) {
		int i =0;
		System.out.println("Even numbers are:");
		for (i = strt;i<=idx;i++)
		{
			if (i%2 == 0)
				System.out.println(i);
		}
		
	}
	void printDivisibleBy5(int strt, int idx) {
		int i =0;
		System.out.println("Divisible by 5, numbers are:");
		for (i = strt;i<=idx;i++)
		{
			if (i%5 == 0)
				System.out.println(i);
		}
	}
	void printDivisibleBy5_3(int strt, int idx) {
		int i =0;
		System.out.println("Divisible by 5 & 3, numbers are:");
		for (i=strt;i<=idx;i++)
		{
			if (i%5 == 0 && i%3 == 0)
				System.out.println(i);
		}
	}
	void printDivisibleBy7_13(int strt, int idx) {
		int i =0;
		int divisor_1 = 7;
		int divisor_2 = 13;
		for (i=strt;i<=idx;i++)
		{
			if (i%7 == 0)
				System.out.println(i+" is Divisible by: "+divisor_1);
			else if(i%13 == 0)
				System.out.println(i+" is Divisible by: "+divisor_2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberRange numberrange = new NumberRange();
		numberrange.printAllEven(10,15);
		System.out.println();
		numberrange.printDivisibleBy5(10,30);
		System.out.println();
		numberrange.printDivisibleBy5_3(5,18);
		System.out.println();
		numberrange.printDivisibleBy7_13(5,40);
	}

}
