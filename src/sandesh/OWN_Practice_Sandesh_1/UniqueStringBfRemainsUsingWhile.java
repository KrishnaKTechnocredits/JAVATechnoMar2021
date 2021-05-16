package sandesh.OWN_Practice_Sandesh_1;

public class UniqueStringBfRemainsUsingWhile {

	private String removeDuplicate(String inputStr) {
		StringBuffer sb  = new StringBuffer(inputStr);
		int index = sb.length()-1;
		while(index >=0) {
			if(index != sb.indexOf(String.valueOf(sb.charAt(index)))) {
				sb.replace(index, index+1, "");
			}
			index--;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String input = "abcdcba";
		String uniqueString = new UniqueStringBfRemainsUsingWhile().removeDuplicate(input);
		System.out.println(uniqueString);
	}
}
