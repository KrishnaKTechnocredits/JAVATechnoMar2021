/*Assignment-4 :*/

package renuka;

class NumberGame{
  
     void findMaxNumber(int number1, int number2, int number3){
	     if(number1 > number2 && number1 > number3){
		     System.out.println(number1+ " is Maximum");
		 }
		 else if(number2 > number3){
		     System.out.println(number2+ " is Maximum");
		      }
			  else if(number1 == number2 && number1 == number3){
		      System.out.println("All numbers are equal");
		           }
				   else
				       System.out.println(number3+ " is Maximum");
	 }
	 
	 void findMinNumber(int number1, int number2, int number3){
	     if(number1 < number2 && number1 < number3){
		     System.out.println(number1+ " is Minimum");
		 }
		 else if(number2 < number3){
		     System.out.println(number2+ " is Minimum");
		      }
			  else if(number1 == number2 && number1 == number3){
		      System.out.println("All numbers are equal");
		           }
				   else
				       System.out.println(number3+ " is Minimum");
	 }
	 
	 public static void main(String[] args){
	     NumberGame numberGame = new NumberGame();
		 numberGame.findMaxNumber(10,20,30);
		 numberGame.findMinNumber(40,50,60);
	 
	 }
}