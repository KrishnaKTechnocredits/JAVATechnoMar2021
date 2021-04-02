package gaurav;

public class RangeDivisible {
	void no(int start,int end) 
	{
		while(start<=end)
		{
			if(start%7==0)
			{
				System.out.println(start + " is divisible by 7");
			}	
			else if(start%13==0) 
			{
				System.out.println(start + " is divisible by 13");
			}
			start++;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RangeDivisible rangeDivisible1 = new RangeDivisible();
		rangeDivisible1.no(5,40);
	}

}
