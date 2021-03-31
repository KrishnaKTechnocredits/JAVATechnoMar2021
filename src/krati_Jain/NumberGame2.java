
package krati_Jain;

class NumberGame2 {
	int num1;
	int num2;
	int num3;
	
	void setNumbers (int input1, int input2, int input3) {
		num1 = input1;
		num2 = input2;
		num3 = input3;
	}
	
	void findMaxNumber() {
		if (num1 > num2 && num1 > num3){
			System.out.println("Maximum number is " + num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("Maximum number is " + num2);
		}else if (num3 > num1 && num3 > num2) {
			System.out.println("Maximum number is " + num3);
		//else if ((num1 == num2) && (num2 == num3) && (num3 == num1))
		}else {
			System.out.println("Maximum number could not found, All given numbers are identical");
		}
	}
	
	void findMinNumber() {
		if (num1 < num2 && num1 < num3) {
			System.out.println("Minimum number is " + num1);
		}else if (num2 < num1 && num2 < num3) {
			System.out.println("Minimum number is " + num2);
		}else if (num3 < num1 && num3 < num2) {
			System.out.println("Minimum number is " + num3);
		//else if (num1 == num2 && num2 == num3 && num3 == num1);
		}else {
			System.out.println("Minimum number could not found, All given numbers are identical");
		}
	}
	
	public static void main(String[] a) {
		NumberGame2 numberGame2 = new NumberGame2();
		numberGame2.setNumbers(11,11,11);
		numberGame2.findMaxNumber();
		numberGame2.findMinNumber();
	}
}