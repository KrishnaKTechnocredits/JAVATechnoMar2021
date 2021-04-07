//Create a class named as NumberGame with following methodmethods like findMaxNum and findMinNum

package shilpa.Assignment_1_5;

class NumberGame{
		void findMaxNum(int num1, int num2,int num3){
		if(num1 == num2 && num1 == num3){
			System.out.println("Maximum number could not found,All given numbers are equal.");
		}else if(num1 > num2 && num1 > num3){
			System.out.println("Maximum number is:  " + num1);
		}else if(num2 > num3 && num2 > num1){
			System.out.println("Maximum number is:  " + num2);
		}else {
			System.out.println("Maximum number is:  " + num3);
		}
	}

	
	void findMinNum(int num1, int num2,int num3){
		if(num1 == num2 && num1 == num3){
			System.out.println("Minimum number could not found,All given numbers are equal.");
		}else if(num1 < num2 && num1 < num3){
			System.out.println("Minimum number is:  " + num1);
		}else if(num2 < num1 && num2 < num3){
			System.out.println("Minimum number is:  " + num2);
		}else{
			System.out.println("Minimum number is:  " + num3);
		}
	}
	
	public static void main(String[] a){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNum(25,35,45);
		numberGame.findMaxNum(5,5,5);
		numberGame.findMinNum(12,6,25);
		numberGame.findMinNum(6,6,6);
	}
}