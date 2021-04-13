package technocredits.arrayDemo;

public class Example6 {

	void m1(int[] num2) {
		num2[num2.length-1] = 300;
	}
	
	void m2(int[] num1) {
		num1[num1.length-1] = 200;
	}
	
	public static void main(String[] args) {
		Example6 example5 = new Example6();
		int[] temp = {10,20,30};
		example5.m1(temp);
		example5.m2(temp);
		
		for(int index=0;index<temp.length;index++) {
			System.out.println(temp[index]);
		}// 10 20 200
		
	}
}
