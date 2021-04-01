package nikita;

public class SimpleInterest {

	void simpleint(int p, int t, int r)
	{
		int ans= (p*t*r)/100;
		System.out.println("The simple interest is: "+ans);
	}
	
public static void main(String args[])
{
	SimpleInterest sp= new SimpleInterest();
	sp.simpleint(10, 20, 40);
}
}
