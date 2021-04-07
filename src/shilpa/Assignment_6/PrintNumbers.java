package shilpa.Assignment_6;

public class PrintNumbers{
	void evenNumbers(int num1, int num2) {
		System.out.println("Even Numbers from given range "+num1 + "-"+num2);
		for(int index=num1;index<=num2;index++) {
			if(index%2 == 0)
			{
			System.out.println(index);
			}
		}
	}
		
	void NosDivisiblebyFive(int num1, int num2) {
		System.out.println("Numbers divisible by 5 from given range "+num1 + "-"+num2);
		for(int index=num1;index<=num2;index++) {
			if(index%5 == 0)
			{
			System.out.println(index);
			} 
		}
		
	}
	
	void NosDivisiblebyThree_Five(int num1, int num2) {
		System.out.println("Numbers divisible by 3 and 5  from given range "+num1 + "-"+num2);
		for(int index=num1;index<=num2;index++) {
			if(index%3 == 0 && index%5 == 0)
			{
			System.out.println(index);
			} 
		}
		
	}
	
	void NosDivisiblebySeven_Thirteen(int num1, int num2) {
		
		System.out.println("Numbers divisible by 7 or 13 from given range "+num1 + "-"+num2);
		for(int index=num1;index<=num2;index++) {
			if(index%7 == 0)
			{
				System.out.println(index +" Divisible by 7" );
			} else if(index%13 == 0)
			{
			System.out.println(index +" Divisible by 13");
			} 
		}
		
	}

	
	public static void main(String[] args) {
		PrintNumbers printnumbers = new PrintNumbers();
		printnumbers.evenNumbers(10,15);
		printnumbers.NosDivisiblebyFive(10,30);
		printnumbers.NosDivisiblebyThree_Five(5, 18);
		printnumbers.NosDivisiblebySeven_Thirteen(5,40);
	}
}

