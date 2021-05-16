package sandesh.OWN_Practice_Sandesh_1;

public class UniqueStringBfRemains {

	private String removeDuplicate(String inputStr) {
		StringBuffer sb  = new StringBuffer(inputStr);
		for(int index = sb.length()-1; index >= 0; index--) {
			if(index != sb.indexOf(String.valueOf(sb.charAt(index)))) {
				sb.replace(index, index+1, "");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String input = "abcdcba";
		String uniqueString = new UniqueStringBfRemains().removeDuplicate(input);
		System.out.println(uniqueString);
	}
}
