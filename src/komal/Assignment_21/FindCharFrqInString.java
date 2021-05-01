package komal.Assignment_21;

/*c) Find all character frequency from each name given in String array.
Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
Output : r -> 1 time in raj
a -> 1 time in raj
j -> 1 time in raj
=====================
a -> 3 time in aarya
r -> 1 time in aarya
y -> 1 time in aarya
====================*/

public class FindCharFrqInString {
	int getCharFrequency(String str, char chTarget) {
		int cnt = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == chTarget) {
				cnt++;
			}
		}
		return cnt;
	}

	String getFullString(String[] strAr) {
		String my_str = "";
		for (int index = 0; index < strAr.length; index++) {
			my_str += strAr[index];
		}
		System.out.println(my_str);
		return my_str;
	}

	void getallCharFrequency(String[] strAr) {
		String strFull = getFullString(strAr);
		for (int index = 0; index < strFull.length(); index++) {
			char ch = strFull.charAt(index);
			if (strFull.indexOf(ch) == index) {
				System.out.println("Frequency of " + ch + " is: " + getCharFrequency(strFull, ch));
			}
		}
	}

	public static void main(String[] args) {
		FindCharFrqInString chrFreq = new FindCharFrqInString();
		String[] strArray = { "java", "selenium", "manual", "automation" };
		chrFreq.getallCharFrequency(strArray);
	}
}
