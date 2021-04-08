package dhanshri.Assignment_4;

public class NumberGame{
	
	void findMaxNumber(int num1, int num2, int num3){
		if (num1>num2 && num1>num3){
			System.out.println("Maximum number is "+num1);
		}else if (num2>num3){
			System.out.println("Maximum number is "+num2);
		}else if (num1==num2 && num2==num3){
			System.out.println("Maximum number could not found, All given numbers are equals");
		}else{
			System.out.println("Maximum number is "+num3);
		}
		
	}		
	void findMinNumber(int num1, int num2, int num3){
		if (num1<num2 && num1<num3){
			System.out.println("Minumun=m number is "+num1);
		}else if (num2<num3){
			System.out.println("Minimum number is "+num2);
		}else if (num1==num2 && num2==num3){
			System.out.println("Minimum number could not found, All given numbers are equals");
		}else {
			System.out.println("Minimum number is "+num3);
		}
	}
	 
	public static void main(String[] args){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(2,20,14);
		numberGame.findMinNumber(13,5,7);
		numberGame.findMaxNumber(9,9,9);
	}
}