package monali.coding_exam_10;

public class FirstNonReapetedCharacter {

	void nonRepeatedChar(String input) {
		for(int index = 0;index<input.length();index++) {
			boolean flag = true;
			for(int i = 0;i<input.length();i++) {
				if(index != i && input.charAt(index) == input.charAt(i)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("first non repeated char is "+input.charAt(index));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		 FirstNonReapetedCharacter input =  new FirstNonReapetedCharacter();
		 String str = "abcgbca";
		 input.nonRepeatedChar(str);
	}
}
