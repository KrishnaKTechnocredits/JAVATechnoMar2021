//Print Number range using while loop.
package shilpa.Assignment_8;

public class PrintNosWhileLoop{
	void evenNumbers(int num1, int num2) {
		System.out.println("Even Numbers from given range "+num1 + "-"+num2);
		int index=num1;
		while(index<=num2) {
			if(index%2 == 0)
			{
			System.out.println(index);
			}
			index++;
		}

	}

	void NosDivisiblebyFive(int num1, int num2) {
		System.out.println("Numbers divisible by 5 from given range "+num1 + "-"+num2);
		int index=num1;
		while(index<=num2) {
			if(index%5 == 0)
			{
			System.out.println(index);
			} 
			index++;
		}

	}

	void NosDivisiblebyThree_Five(int num1, int num2) {
		System.out.println("Numbers divisible by 3 and 5  from given range "+num1 + "-"+num2);
		int index=num1;
		while(index<=num2) {
			if(index%3 == 0 && index%5 == 0)
			{
			System.out.println(index);
			} 
			index++;
		}

	}

	void NosDivisiblebySeven_Thirteen(int num1, int num2) {

		System.out.println("Numbers divisible by 7 or 13 from given range "+num1 + "-"+num2);
		int index=num1;
		while(index<=num2) {
			if(index%7 == 0)
			{
				System.out.println(index +" Divisible by 7" );
			} else if(index%13 == 0)
			{
			System.out.println(index +" Divisible by 13");
			}
			index++;
		}

	}
	public static void main(String[] args) {
		PrintNosWhileLoop printnumbers = new PrintNosWhileLoop();
		printnumbers.evenNumbers(10,15);
		printnumbers.NosDivisiblebyFive(10,30);
		printnumbers.NosDivisiblebyThree_Five(5, 18);
		printnumbers.NosDivisiblebySeven_Thirteen(5,40);
	}
}