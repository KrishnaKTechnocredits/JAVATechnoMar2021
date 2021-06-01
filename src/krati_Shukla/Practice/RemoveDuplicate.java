package krati_Shukla.Practice;

public class RemoveDuplicate {
	void getFinal(String str) {
		
		String temp ="";
		int length = str.length();
		for (int index=0; index<length ; index++) {
			char ch = str.charAt(index);
			boolean flag = false;
			for(int innerIndex = index; innerIndex<length; innerIndex++) {
				if (ch == str.charAt(innerIndex) && (ch != ' ')) { //checking for Duplicates & spaces should not be considered
					flag = true;
					str = str.replace(ch, ' '); // replacing duplicate characters with spaces
					break;
				}
			}
			if (flag) {
				temp= temp +ch; // if duplicate character found then string in TEMP string
			}
				
		}
		System.out.println(temp);
		
	}
	
	public static void main(String[] a) {
		RemoveDuplicate removeDuplicate = new RemoveDuplicate();
		String input = "abcdcba";
		removeDuplicate.getFinal(input);
	}

}
