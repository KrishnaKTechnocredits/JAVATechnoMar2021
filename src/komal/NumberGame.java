package komal;

class NumberGame{
		
	void findMaxNumber(int num1,int num2,int num3){
		if(num1>num2 && num1>num3){
			System.out.println("Maximum number is "+num1);
		}else if(num2>num3){
			System.out.println("Maximum number is "+num2);
		}else if(num3>num2){
			System.out.println("Maximum number is "+num3);
		} else if((num1 == num2) && (num2 == num3) && (num3 == num1)){
			System.out.println("Maximum number could not found, All given numbers are identical");
		}
	}
	void findMinNumber(int num1,int num2,int num3){
		if(num1<num2 && num1<num3){
			System.out.println("Minimum number is "+num1);
		}else if(num2<num3){
			System.out.println("Minimum number is "+num2);
		}else if(num3<num2){
			System.out.println("Minimum number is "+num3);
		}else if((num1 == num2) && (num2 == num3) && (num3 == num1)){
			System.out.println("Minimum number could not found, All given numbers are identical");
		}
	}
	public static void main(String[] args){
		NumberGame numbergame = new NumberGame();
		numbergame.findMaxNumber(13,4,19);
		numbergame.findMaxNumber(13,13,13);
		numbergame.findMinNumber(13,4,19);
		numbergame.findMinNumber(13,13,13);
		}
	}