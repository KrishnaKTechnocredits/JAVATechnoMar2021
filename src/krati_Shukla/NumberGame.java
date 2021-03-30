package krati_Shukla;

class NumberGame{
	
	void findMaxNumber(int num1,int num2, int num3){
		if (num1 == num2 && num2 == num3)
		System.out.println("Maximum number could not found, All given numbers are identical");
		else if(num1 > num2 && num1 > num3){
			System.out.println ("Maximum number is : "+num1);
		}else if(num2 > num3 && num2 > num1){
			System.out.println ("Maximum number is : "+num2);
		}else{
			System.out.println ("Maximum number is : "+num3);	
		}
	}
	
	void findMiniNumber(int num1,int num2, int num3){
		if (num1 == num2 && num2 == num3)
		System.out.println("Minimum number could not found, All given numbers are identical");
		else if(num1 < num2 && num1 < num3){
			System.out.println ("Minimum number is : "+num1);
		}else if(num2 < num3 && num2 < num1){
			System.out.println ("Minimum number is : "+num2);
		}else{
			System.out.println ("Minimum number is : "+num3);	
		}
	}
	public static void main(String[] a){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(10,15,13);
		numberGame.findMaxNumber(2,2,2);
		numberGame.findMiniNumber(10,9,13);
		numberGame.findMiniNumber(2,2,2);
	}
}