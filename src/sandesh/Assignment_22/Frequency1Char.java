package sandesh.Assignment_22;

public class Frequency1Char {

	int calculateFrequency1Char(String str1, char ch1) {
		int cnt = 0;
		for(int index=0; index<str1.length(); index++) {
			if(str1.charAt(index) == 'e')
				cnt++;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		String str = "technocredits";
		char ch = 'e';
		//Frequency1Char fc1 = new Frequency1Char();
		int count = new Frequency1Char().calculateFrequency1Char(str, ch);
		System.out.println("Count of e in technocredits is :- " + count);
	}
}
