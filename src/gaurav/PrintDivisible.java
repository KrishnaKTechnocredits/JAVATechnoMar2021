package gaurav;

public class PrintDivisible {
	void number(int start,int end) 
	{
		while(start<=end) 
		{
			if(start%5==0 && start%3==0) 
			{
				System.out.println(start +" ");
			}
			start++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDivisible printDivisible1 = new PrintDivisible();
		printDivisible1.number(5,18);

	}

}
