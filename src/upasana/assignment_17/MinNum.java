/*

Program 7: From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
 */

package upasana.assignment_17;

public class MinNum {
	int minNum() {
		int[] arr= {22,35,65,88,11,23,45};
		int min=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(min>arr[index])
				min=arr[index];
		}
		return min;
	}
	
	public static void main(String[] args) {
		int min=new MinNum().minNum();
		System.out.println(min);
	}
}