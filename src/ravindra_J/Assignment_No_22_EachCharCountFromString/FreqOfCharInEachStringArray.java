/*c) Find all character frequency from each name given in the String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
              a -> 1 time in raj
              j -> 1 time in raj
         =====================
	     a -> 3 time in aarya
             r -> 1 time in aarya
              y -> 1 time in aarya
         ====================
         And so on...
 */
package ravindra_J.Assignment_No_22_EachCharCountFromString;

import java.util.Scanner;

public class FreqOfCharInEachStringArray {

	void getFreqOfTargetChar(String word, char targetChar) {
		int count = 0;
		for(int index = 0;index < word.length();index++) {
			char ch = word.charAt(index);
			if(targetChar == ch)
				count++;
		}
		System.out.println(targetChar+ " -> " +count+ " time in "+word);
	}

	void getCharString(String word) {
		for(int index = 0;index < word.length();index++) {
			char ch = word.charAt(index);
			if(index == word.indexOf(ch)) 
				getFreqOfTargetChar(word, ch);	
		}
	}

	void getStringArray(String[] arr) {
		for(int index = 0;index < arr.length;index++) {
			String word = arr[index];
			getCharString(word);
			System.out.println("=====================");
		}
	}

	public static void main(String []agrs){
		FreqOfCharInEachStringArray freqency = new FreqOfCharInEachStringArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Size of Array");
		int size = scanner.nextInt();
		String arr[] = new String [size];
		System.out.println("Please Enter the "+size+" String of Array");
		for(int i=0;i<size;i++) {
			arr[i] = scanner.next();
		}
		//String arr[] = {"Good Review", "by", "Harsh", "Technocredit"};
		freqency.getStringArray(arr);
		scanner.close();
	}

}
