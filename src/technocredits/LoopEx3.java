package technocredits;

public class LoopEx3 {

	void printData(int endNum) {
		while(endNum >= 0) {
			System.out.println(endNum);
			endNum--;
		}
	}
	
	void printData1(int startNum, int endNum) {
		while(startNum <= endNum) {
			System.out.println(endNum);
			startNum++;
		}
	}
	
	void printData2(int startNum, int endNum) {
		while(startNum <= endNum) {
			System.out.println(endNum);
			startNum++;
			endNum--;
		}
	}
	
	void printData3(int startNum, int endNum) {
		while(startNum <= endNum) {
			System.out.println(endNum);
			startNum++;
			endNum--;
		}
	}
	
	void printData4(int startNum, int endNum) {
		do {
			System.out.println(endNum);
			startNum++;
			endNum--;
		}while(startNum <= endNum);
		System.out.println(startNum);
		System.out.println(endNum);
	}
	
	public static void main(String[] args) {
		LoopEx3 loopEx3 = new LoopEx3();
		//loopEx3.printData(5);
		//loopEx3.printData1(1, 5);
		//loopEx3.printData2(1, 5);
		//loopEx3.printData3(5,1);
		loopEx3.printData4(5,1);
	}
}
