package gaurav;

public class Even {
	void number(int start,int end) 
	{
		while(start<=end)
		{
			if(start%2==0) 
			{
				System.out.println(start +" ");
			}
			start++;
		}

	 }

		public static void main(String[]args) {
		Even even1 = new Even();
		even1.number(10,15);
		}
}