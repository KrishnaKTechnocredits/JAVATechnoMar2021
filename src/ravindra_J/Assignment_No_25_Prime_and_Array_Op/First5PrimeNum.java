/*Assignment - 25 : submit > 20th April'2021

Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
 */
package ravindra_J.Assignment_No_25_Prime_and_Array_Op;

public class First5PrimeNum {

	int [] getFirstFivePrimeNum(int fNo, int sNo) {
		int []arr = new int[sNo];
		int index=0;
		for(int i=fNo;i<=sNo;i++){
			int cnt=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) 
					cnt++;
			}
			if(cnt==2) {
				arr[index]=i;
				index++;
			}
				
		}
		return arr;
	}

	public static void main(String[] args) {
		First5PrimeNum first5primenum = new First5PrimeNum();	
		int[] primeNum = first5primenum.getFirstFivePrimeNum(10,50);
		for(int i=0;i<5;i++)
			System.out.println(primeNum[i]);
	}

}
