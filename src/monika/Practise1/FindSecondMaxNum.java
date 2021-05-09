package monika.Practise1;

/*Assignment - 30 : 4th May'2021
WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 */

public class FindSecondMaxNum {
	void getSecondMaxNum(int[] input) {
		int[] arr = new int[input.length];
		int max = arr[0];
		for(int index=1;index<arr.length;index++) {
			if(max < arr[index]) {
				max = arr[index];
				SecondMax = arr[index+1];
			}
			if(max > SecondMax)
				SecondMax = max;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {10,33,43,55,97,11,3};
		FindSecondMaxNum obj = new FindSecondMaxNum();
		obj.getSecondMaxNum(arr);
	}
	
}
