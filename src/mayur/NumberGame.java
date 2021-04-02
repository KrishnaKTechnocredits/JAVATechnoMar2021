//1. Create a class named as NumberGame with following method.
//a. findMaxNumber()
//method should take 3 parameters and print the maximum number from given 3 numbers.
//if all numbers are same print "Maximum number could not found, All given numbers are equals".
//b. findMinNumber()
//method should take 3 parameters and print the minimum number from given 3 numbers.
//if all numbers are same print "Minimum number could not found, All given numbers equal numbers".

class NumberGame
{
	void findMaxNumber(int n1,int n2,int n3)
	{
		 if(n1>n2 && n1>n3)
			 System.out.println("The maximum no. is " +n1);
		 else if(n2>n1 && n2>n3)
			 System.out.println("The maximum no. is " +n2);
		 else if(n3>n1 && n3>n2)
			 System.out.println("The maximum no. is " +n3);
		 else
			 System.out.println("Maximum number could not found, All given numbers are identical");
	}
	
	void findMinNumber(int n1,int n2,int n3)
	{
		if(n1<n2 && n1<n3)
			System.out.println("The minimum no. is " +n1);
		else if (n2<n3 && n2<n1)
			System.out.println("The minimum no. is " +n2);
		else if (n3<n1 && n3<n2)
			System.out.println("The minimum no. is " +n3);
		else
			System.out.println("Minimum number could not found, All given numbers are identical");
	}
	
	public static void main(String[] mayur)
	{
		NumberGame ng = new NumberGame();
		ng.findMaxNumber(13,4,19);
		ng.findMaxNumber(13,13,13);
		ng.findMinNumber(13,4,19);
		ng.findMinNumber(13,13,13);
	}
} 
