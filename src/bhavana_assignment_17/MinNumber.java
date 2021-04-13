package bhavana_assignment_17;

/*From given array return min number.
input : 22,35,65,88,11,23,45
output : 11 */

public class MinNumber {
	
	void minNumber(int [] array) {
		int min=array[0];
		for(int index=0;index<array.length;index++) {
			if(array[index]<min)	
				min=array[index];
		}
		System.out.println("Minimun number is:"+min);
	}
	 public static void main(String[] args) {
		int []arr= {22,35,65,88,11,23,45};
		MinNumber mn=new MinNumber();
		mn.minNumber(arr);
	 }
	
}
