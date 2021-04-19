package gaurav;

public class Division 
{
	void div(int start,int end) 
	{
		for(int i=start;i<=end;i++) 
		{
			if(i%5==0) 
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[]args) {
		Division division = new Division();
		division.div(10,30);
	}

}
