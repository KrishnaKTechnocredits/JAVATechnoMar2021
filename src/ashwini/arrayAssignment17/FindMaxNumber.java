package ashwini.arrayAssignment17;
/*
 Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88

 */

public class FindMaxNumber {
	void maxNumber(int[] input) {
			int maxNumber= 0;
			System.out.println("given array list is :");
			for(int index=0;index<input.length;index++) {
				System.out.println(input[index]);
				if(input[index]>maxNumber)
					maxNumber=input[index];
			}
		
			System.out.println("The maximum number in given array is :"+maxNumber);
		}
	

	public static void main(String[] args) {
		int[] array= {22,35,65,88,11,23,45};
		FindMaxNumber maxNumber=new FindMaxNumber();
		maxNumber.maxNumber(array);
	}

	}

