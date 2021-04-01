//3. Write a Java program to compute simple interest
//Simple Interest = (P x T x R)/100
//Where,
//P is the principle amount
//T is the time [year] and
//R is the rate

class Interest
{
	void simpleInterest(int p, float t,float r)
	{
		float SI=p*t*r/100;
		System.out.println("The Interest is " +SI);
	}
	public static void main(String[] args)
	{
		Interest interest = new Interest();
		interest.simpleInterest(10000,3.5f,2.5f);
		
	}
}