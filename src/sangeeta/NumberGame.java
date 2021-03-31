package sangeeta;
class NumberGame{
	
	void findMaxNumber(int num1, int num2, int num3){
		if(num1> num2 && num1> num3){
			System.out.println(" Maximum nuber is"+num1);
		}else if(num2 > num3){
			System.out.println(" Maximum number is "+num2);
		}else if(num3 > num1){
			System.out.println(" Maximum number is "+num3);
		}else{
			System.out.println(" Maximum number could not found, All given numbers are equal");
		}
		
	}
	
	void  findMinNumber(int num1, int num2, int num3){
		if(num1< num2 && num1< num3){
			System.out.println(" Minimum nuber is"+num1);
		}else if(num2 < num3){
			System.out.println(" Mimimum number is "+num2);
		}else if(num3 < num1){
			System.out.println(" Minimum number is "+num3);
		}else{
			System.out.println(" Minimum number could not found, All given numbers are equal");
		}
	}
	
	public static void main(String[] a){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(13,4,19);
		numberGame.findMinNumber(13,4,19);
		numberGame.findMaxNumber(13,13,13);
		numberGame.findMinNumber(13,13,13);
		numberGame.findMaxNumber(1,4,5);
		numberGame.findMinNumber(55,80,102);
		numberGame.findMaxNumber(0,115,60);
		numberGame.findMinNumber(25,30,300);
	}
}