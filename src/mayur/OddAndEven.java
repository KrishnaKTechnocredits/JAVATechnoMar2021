class OddAndEven
{
	int m;
	boolean EvenAndOdd;
	void test(int m)
	{
		if(m%2==0)
			System.out.println("Given number is  " +m);
		else
			System.out.println("Given number is  " +m);
	}
	void EvenAndOdd(boolean flag)
	{
		EvenAndOdd = flag;
		System.out.println("it is " +EvenAndOdd);
	}
	
	public static void main(String[] args)
	{
		OddAndEven oe = new OddAndEven();
		oe.test(5);
		oe.EvenAndOdd(false);
		oe.test(6);
		oe.EvenAndOdd(true);
		oe.test(7);
		oe.EvenAndOdd(false);
		oe.test(8);
		oe.EvenAndOdd(true);
	}
}