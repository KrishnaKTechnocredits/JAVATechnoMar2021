package monika.Practise1;

import java.util.Scanner;

public class PrimeGG {
	
	public PrimeGG() {
		System.out.println("Hi");
	}
	
	void m1(int input) {
		boolean isPrime = true;
		for(int i=2; i<input;i++) {
			if(input % i == 0 ) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println(input+" No. is Prime");
		}
		else
			System.out.println(input+" No. is not Prime");
	}
	
	public static void main(String[] args) {
		PrimeGG obj = new PrimeGG();
		Scanner sc = new Scanner(System.in);
		System.out.println("Give no.");
		obj.m1(sc.nextInt());
		
		//obj.m1(5);
	}
	

}
