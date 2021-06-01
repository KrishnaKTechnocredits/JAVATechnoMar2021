package monika.Practise1.Revision;

/*Assignment - 30 : 4th May'2021
WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 */

public class FindSecondMaxNum {
	int getSecondMaxNum(int[] input) {
		for(int i=0;i<input.length;i++) {	
			int temp = 0;
			for(int j=i+1;j<=input.length;j++) {
				if(input[i]<input[j-1]) {
					temp = input[i];
					input[i] = input[j-1];
					input[j-1] = temp;
				}		
			}
		}return input[1];
	}
	
	public static void main(String[] args) {
		int[] arr = {10,33,43,55,97,11,3};
		FindSecondMaxNum obj = new FindSecondMaxNum();
		int i = obj.getSecondMaxNum(arr);
		System.out.println(i);
	}
	
}
