/*Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)*/

package kajal.StringAndCharProgram;

public class Assignment29 {
	
	void sumofAll(String str) {
	int evenSum=0, oddSum=0;
	String uppercnt="", lwrcnt="" ,num="";
	
	for (int index = 0; index < str.length(); index++) {
		char ch = str.charAt(index);

		if (Character.isUpperCase(ch))
			uppercnt = uppercnt + ch;
		else if (Character.isLowerCase(ch))
			lwrcnt = lwrcnt + ch;

		if (Character.isDigit(ch))
			num = num + ch;

		if (index != (str.length() - 1)) {
			char ch1 = str.charAt(index + 1);
			if (Character.isDigit(ch) && (Character.isLetter(ch1))) {
				if (Integer.parseInt(num) % 2 == 0) {
					evenSum = evenSum + Integer.parseInt(num);
					num = "";
				} else
					oddSum = oddSum + Integer.parseInt(num);
				num = "";
			}
		}
	}

	if (num != "") {
		if (Integer.parseInt(num) % 2 == 0)
			evenSum = evenSum + Integer.parseInt(num);
		else
			oddSum = oddSum + Integer.parseInt(num);
	}
	System.out.println("Capital letters in string are :" + uppercnt);
	System.out.println("Small letters in string are :" + lwrcnt);
	System.out.println("Even numbers in string are :" + evenSum);
	System.out.println("Odd numbers in string are :" + oddSum);
	System.out.println("Final Output string is : " + oddSum + uppercnt + lwrcnt + evenSum);
}

public static void main(String [] args) {
		String str = "F12TT45ERT5cc56de111";
		new Assignment29().sumofAll(str);
	}
}
