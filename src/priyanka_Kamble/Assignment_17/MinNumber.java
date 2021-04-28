package priyanka_Kamble.Assignment_17;

/*Program 6: From given array return min number.
input : 22,35,65,88,11,23,45
output : 88*/

public class MinNumber {
	
	void minArrayElement(int[] array) {
		int minNumber= array[0];
		int maxNumber = array[0];
		for(int index=1; index<array.length;index++) {
			if(minNumber>array[index]) 
				minNumber=array[index];
			if(maxNumber<array[index]) 
				maxNumber=array[index];
		}
		 System.out.println("Minimum Number of the Array - " +minNumber);
		 System.out.println("Minimum Number of the Array - " +maxNumber);
	}
	
	public static void main(String[] args) {
		int[] array = {22,35,65,88,11,23,45};
		new MinNumber().minArrayElement(array);
	}
}
