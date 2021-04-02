package technocredits;

//When number of iterations are fixed, go with For loop
//When number of iterations are not fixed, go with while loop
public class LoopEx1 {

	void printNumbers(int endNumber) {
		for(int num=1;num<=endNumber;num = num+5) {
			System.out.println(num);
		}
	}
	
	void printNumbersWithWhile(int endNumber) {
		int num = 1;
		while(num <=endNumber) {
			System.out.println(num);
			num = num+2;
		}
	}
	
	public static void main(String[] args) {
		LoopEx1 loopEx1 = new LoopEx1();
		loopEx1.printNumbers(100);
	}
}
