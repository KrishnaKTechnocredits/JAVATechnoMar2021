/*Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53
*/

package sourabh.CodingExam_2;

public class IntegerFromString {
	void getSumOfIntegerFrmStr(String strInput) {
		int sumDigit=0;
		String strTemp="";
		for(int index=0; index<strInput.length(); index++) {
			char checkCh= strInput.charAt(index);
			if(Character.isDigit(checkCh)) {
				strTemp= strTemp+checkCh;//12
			}
			else if(strTemp !=""){
				sumDigit= sumDigit+ Integer.parseInt(strTemp);
				strTemp="";
			}
		}
		//System.out.println(sumDigit);//38
		System.out.println(sumDigit+Integer.parseInt(strTemp));
	}
	public static void main(String[] args) {
		IntegerFromString integerFromString= new IntegerFromString();
		integerFromString.getSumOfIntegerFrmStr("12h14i4w8sdc15");
	}
}
