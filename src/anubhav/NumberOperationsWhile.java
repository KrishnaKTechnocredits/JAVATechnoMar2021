package anubhav;

import java.awt.Taskbar.State;

public class NumberOperationsWhile {
	
	// Even Numbers
	void evenNumbers(int startNum1, int endNumber1){
		System.out.println("Even numbers are: ");
		while (startNum1 <= endNumber1) {
			if ((startNum1%2)==0) {
				System.out.println(startNum1);
			}
			startNum1++;
		}
	}
	
	//  number divisible by 5
	void divBy5(int startNum2, int endNumber2){
		System.out.println("\nNumbers divisible by 5 are: ");
		while (startNum2 <= endNumber2) {
			if ((startNum2%5)==0) {
				System.out.println(startNum2);
			}
			startNum2++;
		}
	}
	
	// numbers divisible by 5 & 3
	void divBy5and3(int startNum3, int endNumber3){
		System.out.println("\nNumbers divisible by 5 and 3 are: ");
		while (startNum3 <= endNumber3) {
			if ((startNum3%5)==0 && (startNum3%3)==0) {
				System.out.println(startNum3);
			}
			startNum3++;
		}
	}
	
	// numbers divisible by 7 or 13
	void divBy7or13(int startNum4, int endNumber4){
		System.out.println("\nNumbers divisible by 17 or 13 are: ");
		while (startNum4 <= endNumber4) {
			if ((startNum4%7==0) || (startNum4%13==0)) {
				if((startNum4%7)==0) {
					System.out.println(startNum4 + " is divisible by 7");
				}else {
					System.out.println(startNum4 + " is divisible by 13");
				}
			}
			startNum4++;
		}
	}
	
	
	public static void main (String[] args) {
		NumberOperationsWhile numberOperationsWhile= new NumberOperationsWhile();
		numberOperationsWhile.evenNumbers(1,10);
		numberOperationsWhile.divBy5(1,20);
		numberOperationsWhile.divBy5and3(1,30);
		numberOperationsWhile.divBy7or13(1,40);
	}
}