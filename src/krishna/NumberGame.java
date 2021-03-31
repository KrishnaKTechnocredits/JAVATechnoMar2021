package krishna;
class NumberGame{
	
	void findMaxNumber(int num1, int num2, int num3){
		System.out.println("Given number to find Maximum number is:"+num1+","+num2+","+num3);
		if(num1>num2 && num1>num3){
			System.out.println("Maximum number is :"+num1);
		}else if(num2>num3){
			System.out.println("Maximum number is :"+num2);
		}else{
			System.out.println("Maximum number not found. All numbers are equal");
		}
	}
	
	void findMinNumber(int num1, int num2, int num3){
		System.out.println("Given number to find minimum number is:"+num1+","+num2+","+num3);
		if(num1<num2 && num1<num3){
			System.out.println("Manimum number is :"+num1);	
		}else if(num2<num1 && num2<num3){
			System.out.println("Manimum number is :"+num2);	
		}else if(num3<num1 && num3<num2){
			System.out.println("Manimum number is :"+num3);	
		}else{
			System.out.println("Manimum number not found. All numbers are equal");
		}
		
	}
	
	public static void main(String[] args){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(1,2,3);
		numberGame.findMinNumber(7,8,9);
	}
}