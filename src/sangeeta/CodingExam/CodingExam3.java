/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

 input :  globant india test automation engineer

 output :  glbnt nd tst tmtn ngnr*/

package sangeeta.CodingExam;

import java.util.Scanner;

public class CodingExam3 {
	
	String getString(String str) {
		String stroutput = " ";
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) 
				stroutput = stroutput + ch;	
		}
		return stroutput;
		
	}
	
	String [] getStringArray(String [] strArr) {
		String [] output = new String [strArr.length];
		for(int index = 0; index<strArr.length; index++) {
			String str = strArr[index];
			output [index] = getString(str);
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		CodingExam3 codingExam3 = new CodingExam3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of the array ");
		int size = scanner.nextInt();
		String[] strArr = new String[size];
		System.out.println("Enter strings array ");
		for(int index =0; index<strArr.length; index++) {
			strArr [index]  = scanner.next();
		}
		String [] output = codingExam3.getStringArray(strArr);
		for(int index =0; index<output.length; index++) {
			System.out.println(output[index]);
		}
		
		
	}

}
