package surabhi;
/*
 * 
 * Assignment num 4
 * */
class NumberGame{
	
	void findMaxNumber(int num1, int num2, int num3){ 
		if(num1>num2 && num1>num3){
			System.out.println("Maximum number is :"+num1);
		}
		else if(num2>num3){
			System.out.println("Maximum number is :"+num2);
		}
		else if(num1==num2 && num1==num3){
			System.out.println("Maximum number could not found, All given numbers are identical");
		}
		else{
		System.out.println("Maximum number is :"+num3);
		}
	}
	
	void findMinNumber(int num1, int num2, int num3){ 
		if(num1<num2 && num1<num3){
			System.out.println("Minimum number is :"+num1);
		}
		else if(num2<num3){
			System.out.println("Minimum number is :"+num2);
		}
		else if(num1==num2 && num1==num3){
			System.out.println("Minumum number could not found, All given numbers are identical");
		}
		else{
			System.out.println("Minimum number is :"+num3);
		}
	}
	
	public static void main(String[] args){
		NumberGame numberGame=new NumberGame();
		numberGame.findMaxNumber(4,3,5);
		numberGame.findMinNumber(5,3,2);
		numberGame.findMaxNumber(2,2,2);
		numberGame.findMinNumber(5,5,5);
	}
}

