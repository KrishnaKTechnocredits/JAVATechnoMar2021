package rahul_Hiremath;

public class Ass_6 {
	void printEvenNo(int startIndex, int endIndex)
	{
		System.out.println("Even numbers are:");
			for (int i = startIndex; i<=endIndex; i++)
			{
				int evenAns = i%2;
			 		if (evenAns == 0)
			 			System.out.println(i);
			}
			System.out.println("*****************************");
	}
	
	void div5(int startIndex, int endIndex, int num)
	{
		System.out.println("Divisible by " + num +  ", numbers are: ");
			for (int i = startIndex; i<=endIndex; i++)
			{
				int div5 = i%num;
					if (div5 == 0)
						System.out.println(i);
			}
			System.out.println("*****************************");
	}
	
	void div_5_3(int startIndex, int endIndex, int num1, int num2)
	{
		System.out.println("Divisible by " + num1 + " & " + num2 + ", numbers are: ");
			for (int i=startIndex; i<=endIndex; i++)
			{
				if (i%num1==0 && i%num2==0)
					System.out.println(i);
			}
			System.out.println("*****************************");	
	}
	
	void div_7_13 (int startIndex, int endIndex, int num1, int num2)
	{
		for (int i=startIndex; i<=endIndex; i++)
		{
			if (i%num1 == 0)
				System.out.println(i + " is divisible by " + num1);
			else if (i%num2 == 0)
				System.out.println(i + " is divisible by " + num2);
		}
		System.out.println("*****************************");
	}
	
	public static void main(String[] args) {
		Ass_6 ass_6 = new Ass_6();
		ass_6.printEvenNo(10, 15);
		ass_6.div5(10, 30, 5);
		ass_6.div_5_3(5, 18, 3, 5);
		ass_6.div_7_13(5, 40, 7, 13);
	}
}