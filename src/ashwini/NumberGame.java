package ashwini;

class NumberGame{
	void findMaxNumber(int num1, int num2, int num3){
		System.out.println(num1 +" " + num2 +" "+ num3);
		if(num1>num2 && num1>num3){
			System.out.println("maximun number is" + num1);
			
		}else if(num2<num3){
			System.out.println("maximun number is"+num2);
		}
		else if(num1== num2 && num1==num3){
			System.out.println("Maximun Number can not found. All numbers are identical");
		}
	}
	
	void findMinNumber(int num1, int num2, int num3){
		System.out.println(num1 + " "+ num2 + " " +  num3);
		if(num1>num2 && num1<num3){
			
			System.out.println("Minimum number is"+ num1);
		}
		else if(num2<num3){
			System.out.println("Minimun number is"+ num2);
		}
		else if(num1==num2 && num1==num3){
			System.out.println("Minimum Number can not found. All numbers are identical");
		}
	}
	
	public static void main(String[] a){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(12,10,5);
		numberGame.findMaxNumber(11,11,11);
		numberGame.findMinNumber(21,4,3);
		numberGame.findMinNumber(10,10,10);
	}
	
}