package mayur.assignment24;

public class MiddleCharacter {
	public void getMiddleChar(String[] arr) {
		if (arr != null) {
			int len = arr.length;
			for (int count = 0; count <= len - 1; count++) {
				int lengthOfChar = arr[count].length();
				for (int c = 0; c <= lengthOfChar - 1; c++) {
					int charat = (lengthOfChar - 1) / 2;
					char ch = arr[c].charAt(charat);
					System.out.println(ch);
					if ((len - 1) == c)
						break;
				}
				break;
			}
		}
	}

	public static void main(String[] args) {
		MiddleCharacter middleChar = new MiddleCharacter();
		String[] arr = { "Techno", "Hello", "Credits" };
		middleChar.getMiddleChar(arr);

	}

}
