package parakh;

public class NumberGame{

      void findMaxNumber(int num1, int num2, int num3){
	       System.out.println("From given numbers: " +num1 +", " +num2 +" , " +num3);
		   if((num1 == num2) && (num1 == num3)){
		       System.out.println("Maximum number could not found, All given numbers are equals.");
	    }
	  else{
	      if(num1>num2 && num1>num3){
		      System.out.println("Maximum number is: " +num1);
		  }
		  else if(num2>num1 && num2>num3){
		      System.out.println("Maximum number is: " +num2);
		  }
		  else{
		      System.out.println("Maximum number is: " +num3);
		  }
	    }
      }
      void findMinNumber(int num1, int num2, int num3){
           System.out.println("From given numbers: " +num1 +", "+num2 +", "+num3);
           if((num1 == num2)  && (num1 == num3)){
               System.out.println("Minimum number could not found, All given numbers are equals.");
           }
           else{
               if(num1<num2 && num1<num3){
			   System.out.println("Minimum number is: " +num1);
               }
           else if(num2<num1 && num2<num3){
               System.out.println("Minimum number is: " +num2);
               }
           else {
               System.out.println("Minimum number is: " +num3);
               }
           }
       }

      public static void main(String args[]){
             NumberGame numberGame = new NumberGame();
             numberGame.findMaxNumber(13,4,19);
             numberGame.findMinNumber(13,4,19);
             numberGame.findMaxNumber(13,13,13);
			 numberGame.findMinNumber(13,13,13);
		}
}