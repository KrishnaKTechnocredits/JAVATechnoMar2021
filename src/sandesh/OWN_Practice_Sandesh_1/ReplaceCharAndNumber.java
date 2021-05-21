/*
WAP to convert A134ef7c -> c743fe1A
Replace first character with last character. And first number with last number.
*/

package sandesh.OWN_Practice_Sandesh_1;

public class ReplaceCharAndNumber {
	
	String replaceFirstAndLast(String input) {
		char[] inpStrArr = input.toCharArray();
		char tempHolder = ' ';
		for(int index = 0, backIndex = inpStrArr.length; index <= backIndex; index++, backIndex--) {
			if(Character.isLetter(inpStrArr[index]) && Character.isLetter(inpStrArr[backIndex])) {
				tempHolder = inpStrArr[index];
				inpStrArr[index] = inpStrArr[backIndex];
				inpStrArr[backIndex] = tempHolder;
				
				
			}else if(Character.isLetter(inpStrArr[index]) && Character.isDigit(inpStrArr[backIndex])) {
				
			}else if(Character.isDigit(inpStrArr[index]) && Character.isDigit(inpStrArr[backIndex])) {
			
			}else if(Character.isDigit(inpStrArr[index]) && Character.isLetter(inpStrArr[backIndex])) {
			
			}
		}
		
		return "";
	}

	public static void main(String[] args) {
		String input = "A134ef7c";
		new ReplaceCharAndNumber().replaceFirstAndLast(input);
	}
}
