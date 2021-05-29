/*Programming Test - 11 : 21st May'2021
Verify the given number is Palindrome or not.
input : 12323
output : number is not palindrome
input : 15251
output : number is palindrome*/
package ravindra_J.coding_exam_11_Palindrom_number;

public class PalindromNum {

	void verifyPalindrom(int input) {
		int num = input;
		int temp = 0, sum =0;
		
		while(input > 0) {
			temp = input%10;
			sum = sum * 10 + temp;
			input = input/10;
		}
		if(num == sum)
			System.out.println("input number is palindrom");
		else
			System.out.println("input number is Not a palindrom");	
	}

	public static void main(String[] args) {
		
		PalindromNum palindromnum = new PalindromNum();
		palindromnum.verifyPalindrom(12521);
		palindromnum.verifyPalindrom(15691);
	}
}
