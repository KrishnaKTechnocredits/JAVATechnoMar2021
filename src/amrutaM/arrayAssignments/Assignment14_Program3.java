package amrutaM.arrayAssignments;
/*program 3 : print difference between max and min number from given array.
 *int[] input = {1,11,44,23,55,99,23}; 
 *output : 98
*/
public class Assignment14_Program3 {

	void getDifference(int [] input) {
		int maxNum =0, minNum=input[0];
		for(int index=1;index<input.length;index++) {
			if(input[index]>maxNum) {
				maxNum=input[index];
			}
			if(input[index]<minNum) {
				minNum = input[index];
				System.out.println(minNum);
			}
		}
		System.out.println("Max "+maxNum);
		System.out.println("Min "+minNum);
		System.out.println(maxNum- minNum);
	}
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23}; 
		Assignment14_Program3 assignment14_Program3 = new Assignment14_Program3();
		assignment14_Program3.getDifference(input);
		
	}
}
