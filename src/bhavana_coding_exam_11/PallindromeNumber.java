package bhavana_coding_exam_11;
/*Programming Test - 11 : 21st May'2021

Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome*/
public class PallindromeNumber {

	int reversedNum=0,remainder;
	void Pallindrome(int num) {
		int originalNum=num;
		while(num!=0) {
			remainder=num%10;
			reversedNum=reversedNum*10+remainder;
			num=num/10;
		}
		if(originalNum==reversedNum)
			System.out.println("Given number is Pallindrome");
		else
			System.out.println("Given number is not Pallindrome");
	}	

	public static void main(String[] args) {
		PallindromeNumber pn=new PallindromeNumber();
		//pn.Pallindrome(12323);
		pn.Pallindrome(15251);
	}
}

