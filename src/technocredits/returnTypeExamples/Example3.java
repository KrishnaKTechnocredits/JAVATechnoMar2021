package technocredits.returnTypeExamples;

public class Example3 {
	
	int m1() {
		return 10;
		//System.out.println("Ravindra"); // CE
	}
	
	void m2(int x) {
		if(x == 10) {
			System.out.println("X is 10");
			return;
		}else if(x <=20 && x >10) {
			System.out.println();	
			return;
		}
		System.out.println("Hello");
		return;
	}
	
	String getStudentName(int rollNum) {
		if(rollNum == 10) {
			System.out.println("X is 10");
			return "Trupti";
		}else if(rollNum <=20 && rollNum >10) {
			System.out.println();
			return "Maulik";
		}
		System.out.println("Hello");
		return "Bhushan";
	}
	
	void m3(int num) {
		/*if(num < 0)
			return;
		else {
			
			 * Code here
			 
		}*/
		
		if(num >0){
			
			 ////Code here
			 
		}
		
		System.out.println("Hi");
	}
	
	int m3() {
		int x = 10 + 20;
		int y = x + 40;
		//double d = x + y;
		return y;
	}
}
