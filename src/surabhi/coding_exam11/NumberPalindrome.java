package surabhi.coding_exam11;
/*Programming Test - 11 : 21st May'2021

Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome*/

public class NumberPalindrome {
	
	boolean isPalindrome(int num) {
		int initialNum=num;
		int reverse=0;
		while(num!=0) {
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
		}
		if(initialNum==reverse) {
			return true;			
		}else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPalindrome=false;
		NumberPalindrome numberPalindrome=new NumberPalindrome();
		int num=12323;
		isPalindrome=numberPalindrome.isPalindrome(num);
		if(isPalindrome) {
			System.out.println("Given number " + num + " is palindrome ");
		}else {
			System.out.println("Given number " + num + " is not palindrome ");
		}
		
		int num2=15251;
		isPalindrome=numberPalindrome.isPalindrome(num2);
		if(isPalindrome) {
			System.out.println("Given number " + num2 + " is palindrome ");
		}else {
			System.out.println("Given number " + num2 + " is not palindrome ");
		}
	}

}
