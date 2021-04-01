// Write a Java program to compute simple interest

package krati_Shukla;

class SimpleInterest
{
	void si (int p,int t,int r)
	{
		int interest;
		interest = (p*t*r)/100;
		System.out.println("The simple interest is "+interest);
	}
	public static void main(String[] a)
	{
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.si(5,3,8);
	}
}