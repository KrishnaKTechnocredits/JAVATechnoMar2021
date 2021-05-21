/*
Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13 
 */

package sourabh.CodingExam_8;

public class PrintFibinacciSeries {
	void getFibinacciSeries() {
		int frtNum=0;
		int sndNum=1;
		System.out.print(frtNum+" ");
		System.out.print(sndNum+" ");
		for(int index=2; index<8; index++) {
			int trdnum= frtNum+sndNum;
			System.out.print(trdnum+" ");			
			frtNum= sndNum;	
			sndNum= trdnum;
		}		
	}
	public static void main(String[] args) {
		PrintFibinacciSeries printFibinacciSeries= new PrintFibinacciSeries();
		printFibinacciSeries.getFibinacciSeries();
	}
}
