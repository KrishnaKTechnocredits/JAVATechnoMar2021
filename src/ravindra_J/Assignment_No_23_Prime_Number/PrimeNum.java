/*Assignment No : 23 : Prime number : 
Write a program with different methods to satisfy the following requirement.
1) validate whether a given number is prime or not.
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
   output :
 */

package ravindra_J.Assignment_No_23_Prime_Number;

import java.util.Scanner;

public class PrimeNum {

	void checkPrime(int num1) {
		int flag=0;
		for(int i=2;i<=num1/2;i++){      
			if(num1%i==0){      
				System.out.println(num1+" is not prime number");      
				flag=1;      
				break;      
			}      
		}      
		if(flag==0) 
			System.out.println(num1+" is prime number");	  
	}

	int[] getPrimeBetweenRange(int num1,int num2) {
		System.out.println("The Prime Numbers are between 2 to 100 :");
		int arr[] = new int[num2/4];
		int index=0;
		for(int i=num1;i<=num2;i++) {
			int cnt=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) 
					cnt++;
			}
			if(cnt==2) {
				arr[index]=i;
				index++;
			}
		}
		return arr;
	}

	int getCountPrimeBetweenRange(int num1,int num2) {
		int countPrime=0;
		for(int i=num1;i<=num2;i++) {
			int cnt=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) 
					cnt++;
			}
			if(cnt==2)
				countPrime++;
		}
		System.out.println("count of all the prime num between 2 to 100 : "+countPrime);
		return countPrime;

	}

	int getSumAllPrimeNumBetweenRange(int num1, int num2){
		int total =0;
		int primeNum[] = getPrimeBetweenRange(num1,num2);
		for(int i=0;i<primeNum.length;i++) {
			total = total + primeNum[i] ;			
		}
		System.out.println("total of all the prime num between 2 to 100 : "+total);
		return total;
	}

	void getAverageOfPrimeNumBetweenRange(int num1, int num2) {
		
		float average = getSumAllPrimeNumBetweenRange(num1,num2)/getCountPrimeBetweenRange(num1,num2);
		System.out.println("avarage of all the prime num between 2 to 100 : "+average);
	}

	public static void main(String[] args) {
		PrimeNum primenum = new PrimeNum();
		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter the Number");
		int n1 = scanner.nextInt();
		
		primenum.checkPrime(n1);

		primenum.getAverageOfPrimeNumBetweenRange(2, 100);
		scanner.close();
	}

}
