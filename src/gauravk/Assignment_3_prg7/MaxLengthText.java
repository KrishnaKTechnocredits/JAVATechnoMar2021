package gauravk.Assignment_3_prg7;
/* #3
 * Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits

 */
import java.util.Scanner;

public class MaxLengthText {
	String [] names;
	//String maxLength="";
	String userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many words you are planning to analyse?");
		int set = sc.nextInt();
		names = new String [set];
		for(int index=0; index<set; index++) {
			System.out.println("word "+(index+1));
			names[index] = sc.next();
		}
		String lengthT = "";
		for(int index=0; index<names.length; index++) {
			if(names[index].length() > lengthT.length()) {
				lengthT = names[index];
			}
		}
		return lengthT;
	}
	
	public static void main(String[] a) {
		MaxLengthText maxLengthText1 = new MaxLengthText();
		String maxLength = maxLengthText1.userInput();
		System.out.println("Maximum length word is : "+maxLength);
	}

}
