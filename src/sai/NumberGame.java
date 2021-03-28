package sai;

class NumberGame{
	
	void findMaxNumber(int num1,int num2,int num3){
		if(num1>num2 && num1>num3){
			System.out.println("Maximum number is " + num1);
		}
		else if(num2>num3){
			System.out.println("Maximum number is " + num2);
		}
		else if(num1 == num2 && num2 == num3){
			System.out.println("Maximum number could not be found, All given numbers equal numbers");
		}
		else{
			System.out.println("Maximum number is " + num3);
		}
	}
	
	void findMinNumber(int num1, int num2, int num3){
		if(num1<num2 && num1<num3){
			System.out.println("Minimum number is " + num1);
		}
		else if(num2<num3){
			System.out.println("Minimum number is " + num2);
		}
		else if(num1 == num2 && num2 == num3){
			System.out.println("Minimum number could not found, All given numbers equal numbers");
		}
		else{
			System.out.println("Minimum number is " + num3);
		}
	}
	
	public static void main(String[] args){
		NumberGame numbergame = new NumberGame();
		numbergame.findMaxNumber(11,12,13);
		numbergame.findMinNumber(4,7,5);
		numbergame.findMinNumber(4,4,4);
		numbergame.findMaxNumber(11,11,11);		
	}

}