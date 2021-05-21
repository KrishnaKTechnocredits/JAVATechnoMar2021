package shashank.assignment_29;

public class StringOperation {

	String stringOperation(String str) {
		String temp = "";
		int evenSum = 0, oddSum = 0;
		String lowerCase = "", upperCase = "";
		for (int index = 0; index < str.length(); index++) {
			Character ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
				if (temp.length() > 0 && (index == str.length() - 1)) {
					int num = Integer.valueOf(temp);
					if (num % 2 == 0)
						evenSum += num;
					else
						oddSum += num;
				}
			} else if (Character.isLetter(ch)) {
				if (temp.length() > 0) {
					int num = Integer.valueOf(temp);
					if (num % 2 == 0)
						evenSum += num;
					else
						oddSum += num;
				}
				temp = "";
			}
			if (Character.isUpperCase(ch))
				upperCase += ch;
			else if (Character.isLowerCase(ch))
				lowerCase += ch;
		}
		return oddSum + upperCase + lowerCase + evenSum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperation stringOperation = new StringOperation();
		String str = "F12TT45ERT5cc56de111";
		String output = stringOperation.stringOperation(str);
		System.out.println(output);
	}

}
