//Assignment 5 : 26th Mar 2021

package krati_Jain;

class Practice {
	int m;
	
	void test (int m)
	{
		
		if((m%2)==0)
		{
			
			System.out.println("even");
		}
			else
				System.out.println("odd");
			
		}
		
		
	
	
	public static void main(String[] a)
	{
		
		Practice practice = new Practice();
		practice.test(5);
		practice.test(6);
		practice.test(4);
		
	}
	
}