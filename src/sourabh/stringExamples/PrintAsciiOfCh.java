/*Assignment 18 : 14th April'2021
 * Program 3:  write a method which will print ascii value of A to Z.
 */

package sourabh.stringExamples;

public class PrintAsciiOfCh {
	void getAsciiOfChar(char startCh, char endCh) {
		System.out.println("-------Print ascii value of A to Z----------");
		for(int index=startCh; index<=endCh; index++) {				
			System.out.println((char)index+": "+index);
		}
		
	}
	public static void main(String[] args) {
		PrintAsciiOfCh printAsciiOfCh= new PrintAsciiOfCh();
		printAsciiOfCh.getAsciiOfChar('A','Z');
	}
}
