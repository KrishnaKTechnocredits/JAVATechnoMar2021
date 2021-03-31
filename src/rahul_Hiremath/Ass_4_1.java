package rahul_Hiremath;

class Ass_4_1
{
	void findMaxNumber(int num1, int num2, int num3){
		if(num1 > num2 && num1 > num3)
			System.out.println("The max number is: " + num1);
		else if (num2 > num1 && num2 > num3)
			System.out.println("The max number is: " + num2);
		else if (num3 > num1 && num3 > num2)
			System.out.println("The max number is: " + num3);
		else if(num1 == num2 && num1 == num3)
			System.out.println("Maximum number could not found, All given numbers are identical");	
	}
	void findMinNumber(int num1, int num2, int num3){
		if (num1 < num2 && num1 < num3)
			System.out.println("The min number is: " + num1);
		else if (num2 < num1 && num2 < num3)
			System.out.println("The min number is: " + num2);
		else if (num3 < num1 && num3 < num2)
			System.out.println("The min number is: " + num3);
		else if(num1 == num2 && num1 == num3)
			System.out.println("Minimum number could not found, All given numbers are identical");
	}
	public static void main (String[] args){
		Ass_4_1 numberGame = new Ass_4_1();
		numberGame.findMaxNumber(3,31,3);
		numberGame.findMinNumber(20,20,20);
	}
}