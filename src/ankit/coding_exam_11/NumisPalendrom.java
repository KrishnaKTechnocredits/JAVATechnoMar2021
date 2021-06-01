package ankit.coding_exam_11;

/*
Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome
 */
public class NumisPalendrom {

	static void checkNumberisPalendrom(int input){
		int num = input;
		int newNum = 0;
		while(num > 0) {
			int rem = num % 10 ;
			newNum = newNum * 10 + rem ;
			num =  num / 10;
		}
		if(newNum == input) 
			System.out.println(input + " is palindrome");
		else
			System.out.println(input + " is not palindrome");		
	}
	public static void main(String[] args) {
		checkNumberisPalendrom(12321);
		checkNumberisPalendrom(123456);	
	}
}
