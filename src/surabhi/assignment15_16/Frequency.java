package surabhi.assignment15_16;

import java.util.Scanner;

public class Frequency {
	
	void printCount(String str, char ch) {
		int count=0;
		ch=Character.toLowerCase(ch);
		str=str.toLowerCase();
		for(int index=0;index<str.length();index++) {
			if (str.charAt(index)==ch){
				count++;
			}
		}
		if(count!=0) {
			System.out.println("Count of "+ch+" is ->"+count);
		}else
			System.out.println("charecter not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frequency frequency=new Frequency();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string :");
		String str=scanner.next();
		System.out.println("enter a charecter to search within string :");
		char ch=scanner.next().charAt(0);
		frequency.printCount(str, ch);
	}
}