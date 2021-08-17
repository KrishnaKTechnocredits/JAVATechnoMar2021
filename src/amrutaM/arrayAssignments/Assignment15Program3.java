package amrutaM.arrayAssignments;

/*program 3 : 
return difference between sum of even number - sum of odd numbers. 
Difference has to be positive. print the answer in main method.  
int[] arr = {12,2,13,9}  
hint : 22 - 14 = 8  
output : 8  
int[] arr = {13,22,10,3} 
hint : 32 - 16 = 16 
output : 16 */
public class Assignment15Program3 {

	int getEvenOddDiff(int[] numbers) {
		int evenSum = 0, oddSum = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] % 2 == 0) {
				evenSum += numbers[index];
			} else {
				oddSum += numbers[index];
			}
		}
		if(evenSum>oddSum)
			return evenSum - oddSum;
		else 
			return oddSum-evenSum;
	}

	public static void main(String[] args) {
		int[] numbers = { 12, 2, 13, 9 };
		Assignment15Program3 assignment15Program3 = new Assignment15Program3();
		int ans = assignment15Program3.getEvenOddDiff(numbers);
		System.out.println("Difference between evenSum and oddSum is --> " + ans);
	}
}
