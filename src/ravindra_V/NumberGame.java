//Assignment4

package ravindra_V;

class NumberGame{
	
	void findMaxNumber(int num1, int num2, int num3){
		if(num1 > num2 && num1 > num3){
			System.out.println("Maximum number from given 3 numbers is " +num1);
		}else if (num2 > num1 && num2 > num3){
			System.out.println("Maximum number from given 3 numbers is " +num2);
		}else if (num3 > num1 && num3 > num2){
			System.out.println("Maximum number from given 3 numbers is " +num3);
		}else{ 
			System.out.println("Maximum number could not found, All given numbers are equals");
		}	
	}
	
	void findMinNumber(int num1, int num2, int num3){
		if(num1 < num2 && num1 < num3){
			System.out.println("Minimum number from given 3 numbers is " +num1);
		}else if (num2 < num1 && num2 < num3){
			System.out.println("Minimum number from given 3 numbers is " +num2);
		}else if (num3 < num1 && num3 < num2){
			System.out.println("Minimum number from given 3 numbers is " +num3);
		}else{
			System.out.println("Minimum number could not found, All given numbers are equals");
		}	
	}
	
	public static void main(String[] args){
		NumberGame numbergame = new NumberGame();
		numbergame.findMaxNumber(13,4,19);
		numbergame.findMaxNumber(13,13,13);
		numbergame.findMinNumber(13,4,19);
		numbergame.findMinNumber(14,14,14);
	}
}