package madhavi_Khasbage.StringIndexOf;

import java.util.Scanner;

/*a) Find one character frequency from given name.
Input: name - technocredits
character - e
Output : e -> 2 time in technocredits
*/

public class FindCharFrequency {
	
	int getCharFrequency(String str,char chTarget) {
		int cnt=0;
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==chTarget) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {	
	/*	FindCharFrequency chrFreq=new FindCharFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string:");
		String my_str = scanner.nextLine();
		System.out.println("Please enter target char:");
		char ch = scanner.nextLine().charAt(0);
		System.out.println("Frequency of " + ch + " is: " + chrFreq.getCharFrequency(my_str,ch));*/
		int cnt1=0;
		for(int i=0;i<3;i++) {			
			for(int j=0;j<i;j++) {
				cnt1++;
			}
			System.out.println(cnt1++);
		}
	}
}
