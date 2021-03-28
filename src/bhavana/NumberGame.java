package bhavana;
class NumberGame{
	
	void findMaxNumber(int num1,int num2,int num3){
		if(num1>num2 && num1>num3){
			System.out.println("Number 1 is max number:" +num1);
		}else if(num2>num1 && num2>num3){
			System.out.println("Number 2 is max number:" +num2);
		}else if(num3>num1 && num3>num1){
			System.out.println("Number 3 is max number:" +num3);
		}else if(num1==num2 && num2==num3 && num1==num3){
			System.out.println("All given numbers are equal");
		}	
	}
	
	void findMinNumber(int num1,int num2,int num3){
		if(num1<num2 && num1<num3){
			System.out.println("Number 1 is min number:" +num1);
		}else if(num2<num1 && num2<num3){
			System.out.println("Number 2 is min number:" +num2);
		}else if(num3<num1 && num3<num1){
			System.out.println("Number 3 is min number:" +num3);
		}else if(num1==num2 && num2==num3 && num1==num3){
			System.out.println("All given numbers are equal");
		}	
	}

	public static void main(String[] args){
		NumberGame ng=new NumberGame();
		ng.findMaxNumber(20,45,89);
		ng.findMaxNumber(12,12,12);
		ng.findMinNumber(4,56,74);
		ng.findMinNumber(74,74,74);
		
		
	}
}
