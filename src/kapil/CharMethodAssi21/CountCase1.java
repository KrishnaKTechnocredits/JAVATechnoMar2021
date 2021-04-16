/*
1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/

package kapil.CharMethodAssi21;

public class CountCase1 {
	
	void getCountAll(String str) {
		int cntDigit = 0;
		int Letters = 0;
		int cntUppprcase = 0;
		int cntLowercase = 0;
		int cntSplcase = 0;
		int length = str.length();
		for(int index = 0; index< length; index++) {
			char ch = str.charAt(index);
			if(ch >=48 && ch<= 57  ) 
				cntDigit++;
			else if(ch >= 65 && ch <=90)
                 cntUppprcase++;
			else if (ch >= 97 && ch <=122)
				cntLowercase++;
			else 
				cntSplcase++;}
			
			{
					System.out.println("Total Digits = "+cntDigit);
					System.out.println("Total Uppercase = "+cntUppprcase);
					System.out.println("Total lowercase = "+cntLowercase);
					System.out.println("Total spl character = "+cntSplcase);
					System.out.println("Total Letter = "+(cntUppprcase+cntLowercase));
				}
			}
			
		public static void main(String[] args) {
		CountCase1 countcase = new CountCase1();
		countcase.getCountAll("1rRpd3F9#K(E");
	}
}
