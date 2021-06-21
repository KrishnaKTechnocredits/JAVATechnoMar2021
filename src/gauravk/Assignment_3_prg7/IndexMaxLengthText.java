package gauravk.Assignment_3_prg7;

/* #3
 * Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
 */
import java.util.Scanner;

public class IndexMaxLengthText {
	String [] names;
	int userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many words you are planning to analyse?");
		int set = sc.nextInt();
		names = new String [set];
		for(int index=0; index<set; index++) {
			System.out.println("word "+(index+1));
			names[index] = sc.next();
		}
		int indexNum=0;
		String lengthT = "";
		int num[] = new int[set];
		for(int index=0; index<names.length; index++) {
			if(names[index].length() > lengthT.length()) {
				lengthT = names[index];
				indexNum = index;
			}
		}
		return indexNum;
	}
	
	public static void main(String[] a) {
		IndexMaxLengthText indexMaxLengthText1 = new IndexMaxLengthText();
		int indexNumber = indexMaxLengthText1.userInput();
		System.out.println("Maximum length word index is : "+indexNumber);
	}

}
