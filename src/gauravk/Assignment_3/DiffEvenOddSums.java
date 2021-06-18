package gauravk.Assignment_3;

/*#3
  
Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
??	int getDifference(int[] input){
	
	}
*/

public class DiffEvenOddSums {
	int countOdd = 0;
	int countEven = 0;
	int diff;
	
	void differenceCalculator(int[] nums) {
		int totalEven = 0;
		int totalOdd = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				countEven++;
				totalEven= totalEven + nums[i];
			}
			else {
				countOdd++;
				totalOdd = totalOdd + nums[i];
			}
		}
		if(countEven!=0) {
			System.out.println("There are "+countEven+" even numbers with sum of "+totalEven);
		}
		if(countOdd!=0) {
			System.out.println("There are "+countOdd+" odd numbers with sum of "+totalOdd);
		}
		if(totalEven>totalOdd) {
			diff = totalEven - totalOdd;
		} else {
			diff = totalOdd - totalEven;
		}
		System.out.println("Difference between sums of Odd and even numbers is: "+diff);
	}
	public static void main(String[] args) {
		int [] prog2 = {1,20,30,4,5,22,11,91,60,55};
		DiffEvenOddSums diffEvenOddSums1 = new DiffEvenOddSums();
		diffEvenOddSums1.differenceCalculator(prog2);
	}
}
