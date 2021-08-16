package amrutaM.arrayAssignments;
/*program 4 : 
print difference between max odd number and max even number from given array.
difference should be positive  
int[] input = {1,11,44,23,55,99,23,22}; 
hint : 99 - 44 output : 55 
*/
public class Assignment14_Program4 {

	void getPositiveDifference(int [] input) {
		int maxOdd=0, maxEven=0;
		for(int index = 0; index<input.length;index++) {
			if(input[index]%2==0) {
				if(input[index]>maxEven)
					maxEven = input[index];
			}
			if(input[index]%2!=0) {
				if(input[index]>maxOdd)
					maxOdd = input[index];
			}
		}
		if(maxEven>maxOdd) {
			System.out.println("Difference between max even number and max odd number is "+(maxEven-maxOdd));
		}else if(maxEven<maxOdd) {
			System.out.println("Difference between max even number and max odd number is "+(maxOdd-maxEven));
		} 
	}
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23,22}; 
		Assignment14_Program4 assignment14_Program4 = new Assignment14_Program4();
		assignment14_Program4.getPositiveDifference(input);
		
	}
}
