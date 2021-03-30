package gaurav;

public class Divisible 
{
	void div(int start,int end)
	{
		for(int i=start;i<=end;i++) 
		{
			if(i%5==0 && i%3==0) 
			{
				System.out.println(i);
			}
	    
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisible div1 = new Divisible();
		div1.div(5,18);

	}

}
