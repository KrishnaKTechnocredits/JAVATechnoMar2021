package shashank.assignment_19_22;

public class ArrayCharacterCount {

	public String characterCaseCount(String str) {
		int uppperCaseCnt = 0;
		int lowerCaseCnt = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index)))
				uppperCaseCnt++;
			else
				lowerCaseCnt++; // Assuming there is no digit and special char in input string
		}
		if (uppperCaseCnt > lowerCaseCnt) {// Assuming upper Case count never equal to Lower Case Count
			return "Techno";
		} else {
			return "Credits";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayCharacterCount charCount = new ArrayCharacterCount();
		String str = "TeCHnoSessionS";
		String targetStr = charCount.characterCaseCount(str);
		System.out.println(targetStr);
	}

}
