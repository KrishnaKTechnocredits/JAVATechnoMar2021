package sandesh.Assignment_22;

public class FrequencyAllChar {

	void calculateFrequencyAllChar(String str1, char ch) {
		int cnt = 0;
		for (int index=0; index<str1.length(); index++) {
			if (ch == str1.charAt(index))
				cnt++;
		}
		System.out.println("Frequency of character " + ch + " is --> " + cnt);
	}
	
	void extractEachCharFromWord(String st) {
		for (int index=0; index<st.length(); index++)
			if (index == (st.indexOf(st.charAt(index))))
				calculateFrequencyAllChar(st, st.charAt(index));
	}
	
	public static void main(String[] args) {
		String str = "aakanksha";
		//FrequencyAllChar fc1 = new FrequencyAllChar();
		new FrequencyAllChar().extractEachCharFromWord(str);
	}
}
