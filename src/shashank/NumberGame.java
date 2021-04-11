package shashank;
class NumberGame 
{
	public void findMaxNumber(int a, int b, int c)
	{
		if (a==b && b==c)
			System.out.println("All three numbers are identical");
		else if (a>b && a>c)
			System.out.println("Maximum number is "+a);
		else if (b>c)
			System.out.println("Maximum number is "+b);
		else 
			System.out.println("Maximum number is "+c);
	}
	public void findMinNumber(int a, int b, int c)
	{
		if (a==b && b==c)
			System.out.println("All three numbers are identical");
		else if (a<b && a<c)
			System.out.println("Minimum number is "+a);
		else if (b<c)
			System.out.println("Minimum number is "+b);
		else 
			System.out.println("Minimum number is "+c);
		
	}
	public static void main (String args [])
	{
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(25, 150, 354);
		numberGame.findMaxNumber(10, 10, 8);
		numberGame.findMinNumber(11,12,32);
		numberGame.findMinNumber(1,1,1);
	}
}