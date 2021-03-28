package priyanka_Panat;

/*
 Assignment 4
 */

class NumberGame{
	
	void findMaxNumber(int num1,int num2,int num3){
		if(num1>num2 && num1>num3){
			System.out.println("Maximum number is : " +num1);
		}
		else if(num2>num1 && num2>num3){
			System.out.println("Maximum number is : " +num2);
		}
		else if(num3>num1 && num3>num2){
			System.out.println("Maximum number is : " +num3);
		}
		else{
			System.out.println("Maximum number could not found,All given numbers are equal");
		}
	}
	
	void findMinNumber(int num1,int num2,int num3){
		if(num1<num2 && num1<num3){
			System.out.println("Minimum number is : " +num1);
		}
		else if(num2<num1 && num2<num3){
			System.out.println("Minimum number is : " +num2);
		}
		else if(num3<num1 && num3<num2){
			System.out.println("Minimum number is : " +num3);
		}
		else{
			System.out.println("Minimum number could not found,All given numbers are equal");
		}
	}
	
	public static void main(String[] args){
		NumberGame n1=new NumberGame();
		n1.findMaxNumber(13,14,19);
		n1.findMinNumber(13,14,19);
		n1.findMaxNumber(13,13,13);
		n1.findMinNumber(13,13,13);
	}
}