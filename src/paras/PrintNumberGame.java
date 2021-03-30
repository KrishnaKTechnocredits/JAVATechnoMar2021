package paras;

public class PrintNumberGame {

	void evenNumber(int startNum, int endNum){
		System.out.println("Even Number from Given Range " + startNum + " To " + endNum  + " is:");
		for(int index = startNum; index<= endNum; index++){
			if(index%2 == 0){
				System.out.println(index);
			}
		}
	}
	
	void divideBy5(int startNum, int endNum){
		System.out.println("\nDivisible by 5 from given range " + startNum + " To " + endNum  + " is:");
		for(int index = startNum; index<= endNum; index++){
			if(index % 5 == 0){
				System.out.println(index);
			}
		}
	}
	
	void divideBy5and3(int startNum, int endNum){
		System.out.println("\nDivisible by 5 and 3 from given range " + startNum + " To " + endNum  + " is:");
		for(int index = startNum; index<= endNum; index++){
			if(index % 5 == 0 && index % 3 == 0){
				System.out.println(index);
			}
		}
	}
	
	void divideBy7and13(int startNum, int endNum){
		System.out.println("\nDivisible by 7 and 13 from given range " + startNum + " To " + endNum  + " is:");
		for(int index = startNum; index<= endNum; index++){
			if(index % 7 == 0){
				System.out.println(index + " is divisible by 7");
			}
			else if(index % 13 == 0){
				System.out.println(index + " is divisible by 13");
			}
			
		}
	}
	
	public static void main(String [] args){
		PrintNumberGame printnumbergame = new PrintNumberGame();
		printnumbergame.evenNumber(10,15);
		printnumbergame.divideBy5(10,30);
		printnumbergame.divideBy5and3(5,18);
		printnumbergame.divideBy7and13(5,40);
	}
} 