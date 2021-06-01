//Write a Java program to compute simple interest
package shashank;
class SimpleInterest
{
	public void simpleInterest (int principal, float noOfYears, float rate)
	{
		System.out.println("Simple Interest is:- "+((principal*noOfYears*rate)/100));
	}
	public static void main (String args [])
	{
		SimpleInterest Interest = new SimpleInterest();
		Interest.simpleInterest(2000,3.5f,7.5f);
	}
}