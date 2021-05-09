/* Program 1: Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23    */

package amruta.Assignment_25;

public class FirstFivePrimeNum {
	
	int[] printFirstFivePrimeNum(int startnum, int endnum) {
		int arrcount = 0;
		int[] arraynum = new int[5];
		
		for (int targetnum = startnum; targetnum <= endnum; targetnum++) {
			
			boolean isflag = true;
			
			for (int num = 2; num <= targetnum / 2; num++) {
				if (targetnum % num == 0) {
					isflag=false;
					break;
				}
			}
			if (isflag) {
				arraynum[arrcount]=targetnum;
				arrcount++;
			}
			if(arrcount == 5)
				break;
		}
		return arraynum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("First Five Prime numbers between 10 to 50");
		FirstFivePrimeNum firstfivenum = new FirstFivePrimeNum();
		
		int[] number =  firstfivenum.printFirstFivePrimeNum(10,50);
		
		for(int index=0; index<number.length;index++) {
		System.out.println(+number[index]);
		}
	}
}
