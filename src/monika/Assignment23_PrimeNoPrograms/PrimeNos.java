package monika.Assignment23_PrimeNoPrograms;

import java.util.Scanner;

/*Assignment - 23 : 18th April'2021

Write a program with different method to satisfy following requirement. 
1) validate whether given number is prime or not.
2) print all the prime numbers given range.
   input : 40 to 100
   output : 
3) count all the prime numbers given range.
   input : 2 to 100
   output : 
4) sum of all the prime numbers given range.
   input : 2 to 100
   output : 
5) Average of all the prime numbers given range.
   input : 2 to 100
   output :*/
public class PrimeNos {
	int count =0, sum=0;
	boolean FindPrimeOrNot(int input) {
		boolean isPrimeFlag = true;
		if(input > 1) {
			for(int n = 2;n<input;n++) {
				if(	input % n == 0)
					isPrimeFlag = false;
			}
		}else
			System.out.println(input+" no. is not prime");
	return isPrimeFlag;
	}

	void findPrimeOrNotInRange(int startValue, int endValue) {
		boolean flag = false;
		for(;startValue<=endValue;startValue++) {	
			flag = FindPrimeOrNot(startValue);
			if(flag) {
				count+=1;
				System.out.println(startValue+" No. is prime");
				sum+=startValue;
			}
		}
	}
	
	void countOfPrimeNoInRange() {
		System.out.println(count);
	}
	void sumOfPrimeNoInRange() {
		System.out.println(sum);
	}
	void avgOfPrimeNoInRange() {
		double d = sum/count;
		System.out.println("Avg is : "+d);
	}
	
	public static void main(String[] args) {
		PrimeNos obj = new PrimeNos();
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter any no.");
		obj.FindPrimeOrNot(sc.nextInt());*/
		obj.findPrimeOrNotInRange(2, 10);
		obj.countOfPrimeNoInRange();
		obj.sumOfPrimeNoInRange();
		obj.avgOfPrimeNoInRange();
	}
}
