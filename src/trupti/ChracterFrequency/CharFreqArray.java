package trupti.ChracterFrequency;
import java.util.Scanner;
public class CharFreqArray {
		void printFrequencyArray(String [] nameArr) {
			StringCharFreq stringcharfreq = new StringCharFreq();
			System.out.println("Frequency of Characters in Names");
			for(int index=0; index<nameArr.length; index++) {
					stringcharfreq.printFrequency(nameArr[index]);
					System.out.println("--------------------------------- ");
				}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharFreqArray charfreqarray =new CharFreqArray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many names you want to enter? ");
		int size=scanner.nextInt();
		String [] nameArr=new String[size];
		for(int index=0;index<nameArr.length;index++) {
			System.out.println("Enter Name "+ (index+1) + " : ");
			nameArr[index]=scanner.next();
		}
		charfreqarray.printFrequencyArray(nameArr);
		scanner.close();
	}

}
