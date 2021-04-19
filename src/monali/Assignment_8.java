package monali;

public class Assignment_8 {
	
	
	
	void evenNumber(int startnum , int endnum) {
		 while(startnum <= endnum) {
	    	 if(startnum %2 == 0)
			System.out.println("even numbers are" +startnum);
			startnum = startnum + 1;
			}
	}
	     
	 void printNumber(int startnum1 , int endnum1) {
		 while(startnum1 <= endnum1) {
			if(startnum1 %5 == 0)
			System.out.println("number divisible by 5 is" +startnum1);
			startnum1 = startnum1 + 1;
		}
		
	 }

	 void printNum(int totalnum) {
		 int startnum2 = 0;
		 int num2 = 1;
		 while(startnum2 <= totalnum) {
		 if(num2 %3 == 0 && num2 %5 == 0) {
		 System.out.println("numberdivisible by 3 & 5 is " +num2);
		 startnum2 = startnum2 + 1;
	 }
		 num2 = num2 + 1;
      }
		 
	 }
	 
	 void displayNum(int totalnum) {
		 int num3 = 1;
		 int num4= 1;
		 while(num3 <= totalnum) {
			 if (num4 %7 == 0 && num4 %13 == 0) {
				 System.out.println("number divisible by 7 & 13 is" +num4);
				 num3 = num3 + 1;
		 }
			 num4 = num4 + 1;
		 }
		 
	 }
	 
	 public static void main(String[] a) {
		 Assignment_8 assignment_8 = new Assignment_8();
		 assignment_8.evenNumber(10,15);
		 assignment_8.printNumber(50,70);
		 assignment_8.printNum(20);
		 assignment_8.displayNum(10);
	 }
}

		 
	 
	 
	 
		 
			 
		 
		 
		 
		 
	 
	     
		
	
	
	
	
	


