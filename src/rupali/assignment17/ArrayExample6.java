/*
 * Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88

 */
package rupali.assignment17;

public class ArrayExample6 {
	public static void main(String[] args){
		int[] number= {10,23,45,16,89,34};
		System.out.println("The numbers in given array are");
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		new ArrayExample6().printmaxnumber(number);
		
	}
	
	void printmaxnumber(int[] num) {
		int maxnum=num[0];
		for(int index=1;index<num.length;index++) {
			if(maxnum<num[index])
				maxnum=num[index];
		}
		System.out.println("The max number is: "+maxnum);
	}
}
