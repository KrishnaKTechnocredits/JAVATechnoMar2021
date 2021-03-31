//Assignment4

package radha;

class NumberGame{
	
	void findMaxNumber(int num1, int num2, int num3){
		if(num1 == num2 && num1 == num3){
			System.out.println("Maximum number could not found, All given numbers are equal numbers.");
		}else if(num1>num2 && num1>num3){
			System.out.println("Maximum number from "+num1+","+num2+","+num3+ " is "+num1);
		}else if(num2>num1 && num2>num3){
			System.out.println("Maximum number from "+num1+","+num2+","+num3+ " is "+num2);
		}else{
			System.out.println("Maximum number from "+num1+","+num2+","+num3+ " is "+num3);
		}
	}
	
	void findMinNumber(int num1, int num2, int num3){
		if(num1 == num2 && num1 == num3){
			System.out.println("Minimum number could not found, All given numbers are equal numbers.");
		}else if(num1<num2 && num1<num3){
			System.out.println("Minimum number from "+num1+","+num2+","+num3+ " is "+num1);
		}else if(num2<num1 && num2<num3){
			System.out.println("Minimum number from "+num1+","+num2+","+num3+ " is "+num2);
		}else{
			System.out.println("Minimum number from "+num1+","+num2+","+num3+ " is "+num3);
		}
	}

	public static void main(String[] a){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(11,3,88);
		numberGame.findMaxNumber(5,5,5);
		numberGame.findMinNumber(44,6,7);
		numberGame.findMinNumber(15,15,15);
	}
}