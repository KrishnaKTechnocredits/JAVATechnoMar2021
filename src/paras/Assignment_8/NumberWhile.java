package paras.Assignment_8;

public class NumberWhile {
	
	void evenNumber(int startNum, int endNum){
		System.out.println("Even Number from Given Range " + startNum + " To " + endNum  + " is:");
		int index = startNum;
		while(index<= endNum){
			if(index%2 == 0){
				System.out.println(index);
			}
			index++;
		}
	}
	
	void divideBy5(int startNum, int endNum){
		System.out.println("\nDivisible by 5 from given range " + startNum + " To " + endNum  + " is:");
		int index = startNum;
		while(index<= endNum){
			if(index % 5 == 0){
				System.out.println(index);
			}
			index++;
		}
	}
	
	void divideBy5and3(int startNum, int endNum){
		System.out.println("\nDivisible by 5 and 3 from given range " + startNum + " To " + endNum  + " is:");
		int index = startNum;
		while(index<= endNum){
			if(index % 5 == 0 && index % 3 == 0){
				System.out.println(index);
			}
			index++;
		}
	}
	
	void divideBy7and13(int startNum, int endNum){
		System.out.println("\nDivisible by 7 and 13 from given range " + startNum + " To " + endNum  + " is:");
		int index = startNum;
		while(index<= endNum){
			if(index % 7 == 0){
				System.out.println(index + " is divisible by 7");
			}
			else if(index % 13 == 0){
				System.out.println(index + " is divisible by 13");
			}
			index++;
		}
	}
	
	public static void main(String[] args){
		NumberWhile numberwhile = new NumberWhile();
		numberwhile.evenNumber(10,15);
		numberwhile.divideBy5(10,30);
		numberwhile.divideBy5and3(5,18);
		numberwhile.divideBy7and13(5,40);
	}
}
