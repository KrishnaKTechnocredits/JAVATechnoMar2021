package kapil;

class NumberGame {

     void maxNumber(int num1, int num2, int num3){
	    if(num1>num2 && num1>num3){
		System.out.println( "num1 is maximum = "+num1);
        }		
        else if(num2>num1 && num2>num3){
        System.out.println("num2 is maximum = "+num2); 
		}
		else if(num3>num1 && num3>num2){
		System.out.println("num3 is maximum = "+num3);
        }
		else if (num1 == num2 && num2 == num3 && num3 == num1){
		System.out.println("maximum number could not found, All given number are identical");	
		}
	 }	
	 void minNumber(int num1, int num2, int num3){
	    if(num1<num2 && num1<num3){
		System.out.println("num1 is minimum = "+num1);
        }		
        else if(num2<num1 && num2<num3){
        System.out.println("num2 is minimum = "+num2); 
        }	
     	else if(num3<num1 && num3<num2){
		System.out.println("num3 is minimum = "+num3);
        } 
		else if(num1 == num2 && num2 == num3 && num3 == num1){
		System.out.println("minimum number could not found, All given number are identical");
        }		
	 }	
	 public static void main(String[] args){
        NumberGame numbergame = new NumberGame();
        numbergame.maxNumber(10,20,40);
	    numbergame.maxNumber(55,55,55);
		numbergame.minNumber(30,60,90);
		numbergame.minNumber(45,45,45);
		}
}		
	