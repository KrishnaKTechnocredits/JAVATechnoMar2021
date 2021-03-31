package ashtha;

class NumberGame {

	void findMaxNumber(int maxNumber1,int maxNumber2, int maxNumber3){
		if (maxNumber1 == maxNumber2 && maxNumber1 == maxNumber3){
			System.out.println("Maximum number could not be found, All given numbers are equals.");
		}else if (maxNumber1 > maxNumber2 && maxNumber1 > maxNumber3){
			System.out.println("The maximum number from the given 3 numbers is: "+maxNumber1);
		}else if (maxNumber2 > maxNumber3){
			System.out.println("The maximum number from the given 3 numbers is: "+maxNumber2);
		}else 
			System.out.println("The maximum number from the given 3 numbers is: "+maxNumber3);	
	}
		
	void findMinNumber(int minNumber1,int minNumber2, int minNumber3){
		if (minNumber1 == minNumber2 && minNumber1 == minNumber3){
			System.out.println("Minimum number could not be found, All given numbers are equals.");
		}else if (minNumber1 < minNumber2 && minNumber1 < minNumber3){
			System.out.println("The minimum number from the given 3 numbers is: "+minNumber1);
		}else if (minNumber2 < minNumber3){
			System.out.println("The minimum number from the given 3 numbers is: "+minNumber2);
		}else
			System.out.println("The minimum number from the given 3 numbers is: "+minNumber3);
	} 
			
	public static void main (String[] args){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(12,14,70);
		numberGame.findMaxNumber(12,12,12);
		numberGame.findMinNumber(2,90,32);
		numberGame.findMinNumber(32,32,32);
	}
}