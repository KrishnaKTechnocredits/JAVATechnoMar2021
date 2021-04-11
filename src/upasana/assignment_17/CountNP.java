/*
 Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
 */

package upasana.assignment_17;

public class CountNP {
	
	void count() {
		int[] arr= {10,23,26,-27,-88,87,-65};
		int countN=0;
		int countP=0;
		for(int index=0;index<arr.length;index++){
			if(arr[index]<0)
				countN++;
			else
				countP++;
		}
		System.out.println("negative -> "+countN);
		System.out.println("positive -> "+countP);
	}
	public static void main(String[] args) {
		new CountNP().count();
	}

}
