package ravindra_J.coding_exam_4;

public class PalindromUsingArray {

	boolean isPalindrom(String str1) {
		String tempString = str1;
		StringBuffer sb = new StringBuffer(str1);
		String revString = sb.reverse().toString();
		if (tempString.equals(revString)) {
			return true;
		}
		return false;
	}

	String[] getPalindromArr(String str) {
		String[] palindromArr = new String[str.length()];

		String stringArr[] = str.split(" ");
		for (int index = 0, i = 0; index < stringArr.length; index++) {
			String palindromeString = stringArr[index].toString();
			boolean palindromFlag = isPalindrom(stringArr[index]);
			if (palindromFlag) {
				palindromArr[i] = palindromeString;
				i++;
			}
		}
		return palindromArr;

	}

	public static void main(String[] args) {
		String input = "hi mam i am AJIJA from canada";

		PalindromUsingArray pa = new PalindromUsingArray();

		String[] displayArr = pa.getPalindromArr(input);

		for (int index = 0; index < input.length(); index++) {
			try {
				if (!displayArr[index].isEmpty())
					System.out.println(displayArr[index]);
			} catch (Exception e) {

			}

		}

	}

}
