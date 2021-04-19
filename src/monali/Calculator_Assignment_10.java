package monali;

public class Calculator_Assignment_10 {
	
	    int add(int x, int y){
		    int z = x + y;
			return z;
			
		}
			
		int sub(int x1,int y1){
			int z = x1 - y1;
			return z;
		}
		
		int mul(int x2,int y2){
			int z = x2 * y2;
	        return z;
		}
		
		int div(int x3,int y3){
			int z = x3 / y3;
			return z;
		}
		
		void printTotalAnswer(int addAnswer, int subAnswer, int mulAnswer,int divAnswer){
			int total = addAnswer + subAnswer + mulAnswer + divAnswer;
			System.out.println(total);
		}
		
	     public static void main(String[] args){
			 Calculator_Assignment_10 calculator_assignment_10 = new Calculator_Assignment_10();
			 int addAnswer = calculator_assignment_10.add(30,40);
			 int subAnswer = calculator_assignment_10.sub(24,30);
			 int mulAnswer = calculator_assignment_10.mul(40,25);
			 int divAnswer = calculator_assignment_10.div(30,60);
			 
			 
			 calculator_assignment_10.printTotalAnswer(addAnswer,subAnswer,mulAnswer,divAnswer);
		}
		 
	}




	     
		
		 




