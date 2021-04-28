package shivani.Assignment_28;

/*write a method to return String having all numeric number first followed by captial letter followed by 
		small letter
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output:=12489TCCTehnoredits*/
public class ReturnStringAllNumericNum {

	String stringMsg(String str) {
		String digitString = "";
		String capsString = "";
		String smallString = "";
		String output = "";
		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i)))
				digitString += (str.charAt(i));
			if (Character.isLowerCase(str.charAt(i)))
				smallString += (str.charAt(i));
			if (Character.isUpperCase(str.charAt(i)))
				capsString += (str.charAt(i));

		}
		output = digitString + capsString + smallString;
		return output;
	}

	public static void main(String[] args) {
		ReturnStringAllNumericNum returnStringAllNumericNum = new ReturnStringAllNumericNum();
		String output = returnStringAllNumericNum.stringMsg("Te1Ch2noCr4e_%$d8iTs9");
		System.out.println(output);

	}

}
