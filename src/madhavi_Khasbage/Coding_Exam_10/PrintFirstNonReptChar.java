package madhavi_Khasbage.Coding_Exam_10;

/*Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g*/

public class PrintFirstNonReptChar {
	char getNonRepeatChar(String my_str) {
		char ch = ' ';
		for (int index = 0; index < my_str.length(); index++) {
			ch = my_str.charAt(index);			
			if (my_str.indexOf(ch) == my_str.lastIndexOf(ch)) {
				return ch;
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		PrintFirstNonReptChar objPrintChar=new PrintFirstNonReptChar();
		System.out.println("The first non-repeated character of given String:"+ objPrintChar.getNonRepeatChar("abicgbcakff"));
	}
}
