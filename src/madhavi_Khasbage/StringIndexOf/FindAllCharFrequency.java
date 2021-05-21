package madhavi_Khasbage.StringIndexOf;

import java.util.Scanner;

/* Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1*/
public class FindAllCharFrequency {
	int getCharFrequency(String str, char chTarget) {
		int cnt = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == chTarget) {
				cnt++;
			}
		}
		return cnt;
	}

	void getallCharFrequency(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == index) {
				System.out.println("Frequency of " + ch + " is: " + getCharFrequency(str, ch));
			}
		}
	}

	public static void main(String[] args) {
		FindAllCharFrequency chrFreq = new FindAllCharFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string:");
		String my_str = scanner.next();
		chrFreq.getallCharFrequency(my_str);
		scanner.close();
	}
}
