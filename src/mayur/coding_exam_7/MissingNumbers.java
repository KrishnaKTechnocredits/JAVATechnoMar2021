package mayur.coding_exam_7;

public class MissingNumbers {
		int sumMissingNum(int[] input) {
			int sum = 0;
			for (int num = 1; num <= 10; num++) {
				boolean isMissingNum = false;
				for (int index = 0; index < input.length; index++) {
					if (num == input[index]) 
						isMissingNum = true;
				}
				if (!isMissingNum) 
					sum = sum + num;
			}
			return sum;
		}

		int highestMissingNum(int[] input) {
			int highestNum = 0;
			for (int num = 1; num <= 10; num++) {
				boolean isMissingNum = false;
				for (int index = 0; index < input.length; index++) {
					if (num == input[index]) 
						isMissingNum = true;
				}
				if (!isMissingNum) {
					if (highestNum < num) {
						highestNum = num;
					}
				}
			}
			return highestNum;
		}

		public static void main(String[] args) {
			MissingNumbers number = new MissingNumbers();
			int[] arr = { 1, 3, 4, 7, 9, 10 };
			System.out.println("Sum of missing number is: " + number.sumMissingNum(arr));
			System.out.println("Maximum missing number is: " + number.highestMissingNum(arr));
		}

	}

