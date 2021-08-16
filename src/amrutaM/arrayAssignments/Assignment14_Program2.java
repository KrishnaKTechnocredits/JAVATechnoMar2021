package amrutaM.arrayAssignments;
/*program 2 : find minimum number from given array. 
int[] input = {1,11,44,23,55,99,23}; 
output : 1
*/
public class Assignment14_Program2 {

	void getMinNumber(int [] input) {
		int minNum =input[0];
		for(int index=1;index<input.length;index++) {
			if(input[index]<minNum) {
				minNum = input[index];
			}
		}
		System.out.println("Minimum number from the given array is --> "+ minNum);
	}
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23}; 
		Assignment14_Program2 assignment14_Program2 = new Assignment14_Program2();
		assignment14_Program2.getMinNumber(input);
		
	}
}
