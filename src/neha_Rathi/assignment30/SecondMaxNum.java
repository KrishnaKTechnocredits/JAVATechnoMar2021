/*WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 */
package neha_Rathi.assignment30;

public class SecondMaxNum {
	
	static void secondMaxNum(int[] arr){
		int max=0;
		int seconMax=0;
		for(int index=0;index<arr.length;index++) {
			if(max<arr[index]) {
				seconMax=max;
				max=arr[index];
			}
		}	System.out.println(seconMax);
	}

	public static void main(String[] args) {
		int[] arr = {10,33,43,55,97,11,3};
		secondMaxNum(arr);
	}

}
