package pallavi.Assignment_4;

class NumberGame {
	
	void  findMaxNumber(int num1,int num2, int num3){
		if(num1>num2 && num1>num3){
			System.out.println("Maximum number is  " + num1);
			}
		else if(num2>num1 && num2>num3){
			System.out.println("Maximum number is  " + num2);
		}
		else if(num3>num1 && num3>num2){
			System.out.println("Maximum number is  " + num3);
		}
		else{
			System.out.println("Maximum number could not found, All given numbers equal numbers");
		}
	}
	
	void  findMinNumber(int num1,int num2, int num3){
		if(num1<num2 && num1<num3){
			System.out.println("Minium number is  " + num1);
			}
		else if(num2<num1 && num2<num3){
			System.out.println("Minium number is  " + num2);
		}
		else if(num3<num1 && num3<num2){
			System.out.println("Minium number is  " + num3);
		}
		else{
			System.out.println("Minimum number could not found, All given numbers equal numbers");
		}
	}
	
	public static void main(String abc[]){
		NumberGame numberGame= new NumberGame();
		numberGame.findMaxNumber(12,12,15);
		numberGame.findMinNumber(5,64,25);
		numberGame.findMinNumber(22,22,22);
	
	}


	
	
}