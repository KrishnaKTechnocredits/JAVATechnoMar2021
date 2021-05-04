package shashank.assignment_25;

public class FindAlphanumericString {

	public void isAlphanumericString(String strArray[]) {
		boolean flag = false;
		for (int index = 0; index < strArray.length; index++) {
			char ch[] = strArray[index].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				flag = Character.isDigit(ch[j]);
				if (flag)
					break;
			}
			if (flag)
				System.out.println(strArray[index] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAlphanumericString findAlphanumericString = new FindAlphanumericString();
		String strArray[] = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		findAlphanumericString.isAlphanumericString(strArray);
	}

}
