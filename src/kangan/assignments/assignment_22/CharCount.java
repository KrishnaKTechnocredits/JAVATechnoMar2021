package kangan.assignments.assignment_22;

/*Find one character frequency from given name.
Input: name - technocredits
          character - e
Output : e -> 2 time in technocredits*/

public class CharCount {

	int getCharCount(String str, char target) {
		int count =0;
		for (int index=0;index<str.length();index++) {
			if(str.charAt(index)==target)
				count++;
		}
		return count;
		
	}
	public static void main(String[] args) {
		CharCount charCount = new CharCount();
		int cnt = charCount.getCharCount("technocredits",'c');
		System.out.println(cnt);
	}
}
