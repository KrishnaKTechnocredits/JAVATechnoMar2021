package ami.Assignment_4;

/*
a. findMaxNumber()
method should take 3 parameters and print the maximum number from given 3 numbers.
if all numbers are same print "Maximum number could not found, All given numbers are equals".

b. findMinNumber()
method should take 3 parameters and print the minimum number from given 3 numbers.
if all numbers are same print "Minimum number could not found, All given numbers equal numbers".

 */

public class NumberGame {
	int A;
	int B;
	int C;
	
	void findMaxNumber(int a , int b, int c){
		A = a;
		B = b;
		C = c;
		
		if( a > b && a > c )
			System.out.println("maximum number is : " + a);
		else if(b > a && b > c)
			System.out.println("maximum number is : " + b);
		else if(c > a && c > b )
			System.out.println("maximum number is : " + c);
		else if(a == b && a == c && b==c)
		 System.out.println("Maximum number could not found, All given numbers are equals");
	}

	void findMinNumber() {
		if( A < B && A < C )
			System.out.println("maximum number is : " + A);
		else if(B < A && B < C)
			System.out.println("maximum number is : " + B);
		else if(C < A && C < B )
			System.out.println("maximum number is : " + C);
		else if(A == B && A == C && B == C)
		 System.out.println("Minimum number could not found, All given numbers equal numbers");
	}
	
	public static void main(String[] a) {
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(12,52,80);
		numberGame.findMinNumber();	
	}
	
}
