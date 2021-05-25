package sandesh.OWN_Practice_Sandesh_1;

public class UniqueStringRemains {

	private String removeDuplicate(String inputStr) {
		String temp = "";
		for(int index = 0; index < inputStr.length(); index++) {
			if(temp.contains(String.valueOf(inputStr.charAt(index))) == false)
				temp += inputStr.charAt(index);
		}
		return temp;
	}

	public static void main(String[] args) {
		String input = "abcdcba";
		String uniqueString = new UniqueStringRemains().removeDuplicate(input);
		System.out.println(uniqueString);
	}
}
