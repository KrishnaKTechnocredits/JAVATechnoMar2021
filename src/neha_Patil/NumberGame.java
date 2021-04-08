package neha_Patil;

public class NumberGame {
	void findMaxNumber(int a,int b,int c){
	    if(a>b && a>c){
		   System.out.println("maximum number is: "+a);
		   }else if(b>a && b>c){
		     System.out.println("maximum number is : "+b);
		   }else if(c>a && c>b){
			   System.out.println("maximum number is: "+c);
		   } else{
			   System.out.println("maximum number could not found,all numbers are identical");
			   }
 }
			 void findMinNumber(int a,int b,int c){
	    if (a<b && a<c){
		   System.out.println("minimum number is:"+a);
		   }else if (b<a && b<c){
		     System.out.println("minimum number is : "+b);
		   }else if(c<a && c<b){
			   System.out.println("minimum number is: "+c);
		   } else{
			   System.out.println("minimum number could not found,all numbers are identicall");
			   }
 }  
			public static void main(String[] args) {
			NumberGame num =new NumberGame();
			num.findMaxNumber(13,4,19);
		   num.findMaxNumber(13,13,13);
		   num.findMinNumber(12,44,55);
		   num.findMinNumber(10,10,10);
		   }

}
