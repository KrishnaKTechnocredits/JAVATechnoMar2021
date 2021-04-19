/*
 * Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11




 */
package rupali.assignment17;
public class ArrayExample7 {
	public static void main(String[] args){
		int[] number= {10,23,45,16,89,34};
		System.out.println("The numbers in given array are");
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		new ArrayExample7().printminnumber(number);
		
	}
	
	void printminnumber(int[] num) {
		int minnum=num[0];
		for(int index=1;index<num.length;index++) {
			if(minnum>num[index])
				minnum=num[index];
		}
		System.out.println("The min number is: "+minnum);
	}
}

