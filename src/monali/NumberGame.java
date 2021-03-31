package monali;

class NumberGame{
	int num1 = 55;
	int num2 = 67;
	int num3 = 43;
	
	void findMaxNumber(){
	    if(num1 > num2 && num1 > num3){
	    System.out.println("maximum number is "+num1);
	    }else if(num2 > num1 && num2 > num3){
	     System.out.println("maximum number is "+num2);
        }else if(num3 > num1 && num3 > num2 ){
        System.out.println("maximum number is "+num3);
		}
	}
	
	void findMinNumber(){
		if(num1 < num2 && num1 < num3){
		System.out.println("minimum number is "+num1);
		}else if(num2 < num1 && num2 < num3){
	     System.out.println("minimum number is "+num2);
		}else if(num3 < num1 && num3 < num2){
		System.out.println("minimum number is "+num3);
		}
	}
	
	public static void main(String[] a){
		NumberGame numbergame = new NumberGame();
		numbergame.findMaxNumber();
		numbergame.findMinNumber();
	}
		
}