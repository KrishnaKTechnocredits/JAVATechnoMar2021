package gauravk.Assignment_3;

/*#3

Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
*/

public class CountPositiveNegativeNums {
	int countPositive = 0;
	int countNegative = 0;
	int countZeros = 0;
	
	void numberSums(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<0)
				countNegative++;
			else if(nums[i]>0) {
				countPositive++;
			} else countZeros++;
		}
		if(countZeros==0) {
			System.out.println("There are "+countNegative+" negative numbers & "+countPositive+" positive numbers");
		}else System.out.println("There are "+countNegative+" negative numbers, "+countPositive+" positive numbers & "+countZeros+" Zeros");
	}
	
	public static void main(String[] args) {
		int [] prog3 = {1,-20,30,-4,45, 22,99,0,-6,10};
		CountPositiveNegativeNums countPNNums = new CountPositiveNegativeNums();
		countPNNums.numberSums(prog3);
	}
}