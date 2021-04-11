/*
 Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
 */
package upasana.assignment_17;
	
public class MaxNum {
	int maxNum() {
		int[] arr= {22,35,65,88,11,23,45};
		int max=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(max<arr[index])
				max=arr[index];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int max=new MaxNum().maxNum();
		System.out.println(max);
	}
}
