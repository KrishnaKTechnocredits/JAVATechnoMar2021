package technocredits;

//When number of iterations are fixed, go with For loop
//When number of iterations are not fixed, go with while loop
public class LoopEx2 {

	void printNumbers(int totalNumber) { // 10
		int count = 1;
		int num = 1;
		while(count <= totalNumber) {
			if(num %3 ==0 && num %7 == 0) {
				System.out.println(count + " : " + num);
				count = count + 1;
			}
			num = num + 1;
		}
	}
	
	public static void main(String[] args) {
		LoopEx2 loopEx1 = new LoopEx2();
		loopEx1.printNumbers(20);
	}
}
