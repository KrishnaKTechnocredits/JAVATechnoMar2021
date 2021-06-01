package shashank.assignment_28;

public class StringOperation {

	public String getString(String str) {
		String output = null;
		String digitStr = "";
		String upperCaseStr = "";
		String lowerCaseStr = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				digitStr += str.charAt(index);
			else if (Character.isUpperCase(str.charAt(index)))
				upperCaseStr += str.charAt(index);
			else if (Character.isLowerCase(str.charAt(index)))
				lowerCaseStr += str.charAt(index);
		}
		output = digitStr + upperCaseStr + lowerCaseStr;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperation stringOp = new StringOperation();
		String output = stringOp.getString("Te1Ch2noCr4e_%$d8iTs9");
		System.out.println(output);
	}

}
