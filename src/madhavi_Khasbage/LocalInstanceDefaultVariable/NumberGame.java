package madhavi_Khasbage;

class NumberGame
{
	void findMaxNumber(int num1,int num2,int num3){
		if(num1>num2 && num1>num3){
			System.out.println("Maximum number is: "+num1);
		}else if(num2>num1 && num2>num3){
			System.out.println("Maximum number is: "+num2);
		}else if(num3>num1 && num3>num2){
			System.out.println("Maximum number is: "+num3);
		}else{	
			System.out.println("Maximum number could not found, All given numbers are equals.");
		}		
	}
	
	void findMinNumber(int num1,int num2,int num3){
		if(num1<num2 && num1<num3){
			System.out.println("Minimum number is: "+num1);
		}else if(num2<num1 && num2<num3){
			System.out.println("Minimum number is: "+num2);
		}else if(num3<num1 && num3<num2){
			System.out.println("Minimum number is: "+num3);
		}else{	
			System.out.println("Minimum number could not found, All given numbers are equals.");
		}		
	}
	
	public static void main(String[] agrs){
		NumberGame numbergame1 =new NumberGame();
		numbergame1.findMaxNumber(13,3,23);
		numbergame1.findMinNumber(11,31,9);
	}	
}