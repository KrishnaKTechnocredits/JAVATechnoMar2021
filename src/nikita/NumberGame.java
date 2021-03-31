package nikita;

public class NumberGame {
	void findMaxNumber(int m1, int m2, int m3)
	{
		if(m1>m2 && m1>m3)
			System.out.println("The greater number is:" +m1);
		else if(m2>m3)
			System.out.println("the greater number is:" +m2);
		else
			System.out.println("the greater number is:" +m3);
		}	
	void findMinNumber(int m1, int m2, int m3)
	{
		if(m1<m2 && m1<m3)
			System.out.println("The minimum number is:" +m1);
		else if(m2<m3)
			System.out.println("the minimum number is:" +m2);
		else if(m1==m2 && m2==m3)
			System.out.println ("The numbers are identical");
		else
			System.out.println("the minimum number is:" +m3);
		}
	
		
	public static void main(String args[])
	{
		NumberGame N1= new NumberGame();
		N1.findMaxNumber(13,14,15);
		N1.findMinNumber(13,14,15);
	}
}
