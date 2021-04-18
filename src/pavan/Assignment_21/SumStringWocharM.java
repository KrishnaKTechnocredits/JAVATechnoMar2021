package pavan.Assignment_21;

import java.util.Scanner;



public class SumStringWocharM {
	
	int sumOfNumber=0;
	
	

	void getSumofNumbers(String input) {
	
		
		for (int index=0;index<input.length();index++) {
			
			char ch= input.charAt(index);
			int chi= (int)ch;
			
				if (chi>=48 && chi<=57) {
				
				sumOfNumber= sumOfNumber+Integer.parseInt(String.valueOf(ch));
						//(input.charAt(index));
				
				}
			

			
		}System.out.println(sumOfNumber);
	}
		
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String");
		String in=scan.next();
		SumStringWocharM sumStringWocharM= new SumStringWocharM();
		sumStringWocharM.getSumofNumbers(in);
		
	}

}
