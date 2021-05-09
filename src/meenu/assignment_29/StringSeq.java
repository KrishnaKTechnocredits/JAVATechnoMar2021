package meenu.assignment_29;

/*Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)
*/

public class StringSeq {
	String temp = "";
	int oddSum = 0;
	int evenSum = 0;
	
	void getNum() {
		if (!temp.equals("")) {
			int num = Integer.parseInt(temp);
				if (num % 2 != 0)
					oddSum = oddSum + num;
				else
					evenSum = evenSum + num;
	    }
	}
	
	String getString(String word) {
		String capitalLetter = "";
		String smallLetter = "";
		for (int index = 0; index < word.length(); index++){
			char ch = word.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
				if (index == word.length() - 1) 
					getNum();				
			} else {
				getNum();
				if (Character.isUpperCase(ch))
					capitalLetter = capitalLetter + ch;
				else if(Character.isLowerCase(ch))
					smallLetter = smallLetter + ch;
				temp = "";
			}
		}
		return (oddSum + capitalLetter + smallLetter + evenSum);
	}

	public static void main(String[] args) {
		StringSeq stringSeq = new StringSeq();
		System.out.println("Output string is : " + stringSeq.getString("F12TT45ERT5cc56de111"));
	}
}
