package milind.Exam_01;

import java.util.Scanner;

public class AgeDifference {
	int ageDiffNum(int []inputNumber) {
		int youngerAge=0;
		int elderAge=0;
		
		for(int index=0;index < inputNumber.length;index++) {
			if(inputNumber[index]% 2==0) {
				elderAge=inputNumber[index];
			}else {
				youngerAge=inputNumber[index];
			}
		}
		System.out.println("Elder member Age is :" +elderAge+ "\nyounger member Age is :" +youngerAge+ "\nso difference of both is =" +(elderAge-youngerAge));
		return(elderAge-youngerAge);
	}
	public static void main(String[] Args) {
		AgeDifference ageDifference=new AgeDifference();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many members in Familiy : ");
		int size =scanner.nextInt();
		int[]inputNumber=new int[size];
		
		for(int index=0;index < inputNumber.length;index++) {
			System.out.println("Enter Age "+(index+1));
			inputNumber[index]=scanner.nextInt();
		}
		ageDifference.ageDiffNum(inputNumber);
		scanner.close();
	}
}
