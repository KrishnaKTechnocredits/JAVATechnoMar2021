package madhavi_Raut.Assignment_17;

/*Program 2: return a difference between sum of even number and odd numbers.
From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : evenSum - oddSum
int getDifference(int[] input){
}*/
public class DiffernceBetnSumOfEvenOddNum {
	void findDiffernceBetnSumOfEvenOddNum(int[] num) {
		int sumOfEvenNumbers = 0;
		int sumOfOddNumbers = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0)
				sumOfEvenNumbers += num[index];
			else
				sumOfOddNumbers += num[index];
		}
		if (sumOfEvenNumbers > sumOfOddNumbers)
			System.out.println("Difference between sum of even and odd numbers are: " + (sumOfEvenNumbers - sumOfOddNumbers));
		else
			System.out.println("Difference between sum of odd and even numbers are: " + (sumOfOddNumbers - sumOfEvenNumbers));
	}

	public static void main(String[] args) {
		int[] num = { 10, 23, 26, 27, 88, 87, 65 };
		new DiffernceBetnSumOfEvenOddNum().findDiffernceBetnSumOfEvenOddNum(num);
	}
}
