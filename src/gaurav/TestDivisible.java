package gaurav;

public class TestDivisible {
	void div(int start,int end)
	{
		while(start<=end)
		{
			if(start%5==0) 
			{
				System.out.println(start + " ");
			}
			start++;
		}	
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDivisible testDivisible = new TestDivisible();
		testDivisible.div(10,30);
	}

}
