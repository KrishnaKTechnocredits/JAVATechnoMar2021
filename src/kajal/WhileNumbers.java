package kajal;

public class WhileNumbers {
	
	int num1;
	int num2;

	void evenNumber(int start,  int end) {
		num1 = start;
		num2 = end;
			
		while(num1 <= num2)
		{
			if(num1 % 2 == 0)
			
			System.out.println("Even numbers are: " + num1);
			num1++;
			}
	   }
	
	void divisibleBy5(int start, int end) {
		num1 = start;
		num2 = end;
		 while(num1 <= num2) {
			 if(num1 % 5 == 0)
				 System.out.println("Numbers divisible by 5 are: " + num1);
				num1++;
			} 
		}
	
	void divisibleBy5and3(int start, int end) {
		num1 = start;
		num2 = end;
		 while(num1 <= num2) {
			 if(num1 % 5 == 0 && num1 % 3 ==0)
				 System.out.println("Numbers divisible by 5 and 3 are: " + num1);
				num1++;
			} 
		}
	
	void divisibleBy7or13(int start, int end) {
		num1 = start;
		num2 = end;
		 while(num1 <= num2) {
			 if(num1 % 7 == 0 || num1 %13 == 0)
				 System.out.println("Numbers divisible by 7 or 13 are: " + num1);
				num1++;
			} 
		}
	
	public static void main(String [] args) {
		WhileNumbers whilenumber = new WhileNumbers();
		whilenumber.evenNumber(10,15);
		whilenumber.divisibleBy5(10,30);
		whilenumber.divisibleBy5and3(5,18);
		whilenumber.divisibleBy7or13(5,40);
		}
}
